import { Component, OnInit } from '@angular/core';
import {CUSTOMER} from "../../interface/CustomerDao";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers = CUSTOMER;
  constructor() { }

  ngOnInit() {
  }

}
