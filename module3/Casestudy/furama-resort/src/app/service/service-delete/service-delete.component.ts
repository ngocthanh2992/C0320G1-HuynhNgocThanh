import {Component, Inject, OnInit} from '@angular/core';
import {CustomerService} from "../../services/customer.service";
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import {ServiceService} from "../../services/service.service";

@Component({
  selector: 'app-service-delete',
  templateUrl: './service-delete.component.html',
  styleUrls: ['./service-delete.component.css']
})
export class ServiceDeleteComponent implements OnInit {

  public serviceOfFullName;
  public serviceOfId;

  constructor(
    public dialogRef: MatDialogRef<ServiceDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public serviceService: ServiceService) {
  }

  ngOnInit() {
    this.serviceOfFullName = this.data.data1.name;
    this.serviceOfId = this.data.data1.id;
  }

  deleteService() {
    this.serviceService.deleteService(this.serviceOfId).subscribe(data =>{
      this.dialogRef.close();
    })
  }

}
