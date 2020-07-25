import { Component, OnInit } from '@angular/core';
import {CUSTOMER} from "../../interface/CustomerDao";
import {CustomerService} from "../../services/customer.service";
import {MatDialog} from "@angular/material/dialog";
import {CustomerDeleteComponent} from "../customer-delete/customer-delete.component";
import {CustomerDetailComponent} from "../customer-detail/customer-detail.component";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  public customers;
  constructor(public customerService: CustomerService,
              public dialog: MatDialog) { }

  ngOnInit() {
    this.customerService.getAllCustomers().subscribe(
      data => {this.customers = data;
      console.log(this.customers);
      })
  }

  openDialog(customerID): void {

    this.customerService.getCustomerByID(customerID).subscribe(dataOfCustomer =>{
      const dialogRef = this.dialog.open(CustomerDeleteComponent, {
        width: '500px',
        data: {data1: dataOfCustomer},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });

    });


  }

  openView(customerID):void {
    this.customerService.getCustomerByID(customerID).subscribe(dataOfCustomer =>{
      const dialogRef = this.dialog.open(CustomerDetailComponent, {
        width: '500px',
        data: {data1: dataOfCustomer},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
      });

    });

  }
}
