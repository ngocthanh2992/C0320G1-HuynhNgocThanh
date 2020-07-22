import { Component, OnInit } from '@angular/core';
import {CUSTOMER} from "../../interface/CustomerDao";
import {CustomerService} from "../../services/customer.service";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  public customers;
  constructor(public customerService: CustomerService) { }

  ngOnInit() {
    this.customerService.getAllCustomers().subscribe(
      data => {this.customers = data;
      console.log(this.customers);
      })
  }

}
