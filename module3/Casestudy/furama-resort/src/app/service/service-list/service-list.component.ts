import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../services/customer.service";
import {MatDialog} from "@angular/material/dialog";
import {CustomerDeleteComponent} from "../../customer/customer-delete/customer-delete.component";
import {CustomerDetailComponent} from "../../customer/customer-detail/customer-detail.component";
import {ServiceService} from "../../services/service.service";
import {ServiceDeleteComponent} from "../service-delete/service-delete.component";
import {ServiceDetailComponent} from "../service-detail/service-detail.component";

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {

  public services;
  constructor(public serviceService: ServiceService,
              public dialog: MatDialog) { }

  ngOnInit() {
    this.serviceService.getAllServices().subscribe(
      data => {this.services = data;
        console.log(this.services);
      })
  }

  openDialog(serviceID): void {

    this.serviceService.getServiceByID(serviceID).subscribe(dataOfService =>{
      const dialogRef = this.dialog.open(ServiceDeleteComponent, {
        width: '500px',
        data: {data1: dataOfService},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });

    });


  }

  openView(serviceID):void {
    this.serviceService.getServiceByID(serviceID).subscribe(dataOfService =>{
      const dialogRef = this.dialog.open(ServiceDetailComponent, {
        width: '500px',
        data: {data1: dataOfService},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
      });

    });

  }

}
