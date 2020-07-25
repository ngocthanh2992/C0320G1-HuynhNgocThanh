import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {EmployeeService} from "../../services/employee.service";
import {CustomerService} from "../../services/customer.service";
import {ServiceService} from "../../services/service.service";

@Component({
  selector: 'app-contract-detail',
  templateUrl: './contract-detail.component.html',
  styleUrls: ['./contract-detail.component.css']
})
export class ContractDetailComponent implements OnInit {

  public contractDetail;
  private EmployeeList;
  private CustomerList;
  private ServiceList;
  private serviceName;
  private customerName;
  private employeeName;

  constructor(
    public dialogRef: MatDialogRef<ContractDetailComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public employeeService: EmployeeService,
    public customerSerVice: CustomerService,
    public serviceService: ServiceService) {
  }

  ngOnInit() {
    this.contractDetail = this.data.data1;
    console.log(this.contractDetail);
    this.serviceService.getAllServices().subscribe(data => {
      this.ServiceList = data;
      this.serviceName = data.find(x => x.serviceCode == this.data.data1.serviceCode).name;
    });
    this.customerSerVice.getAllCustomers().subscribe(data => {
      this.CustomerList = data;
      this.customerName = data.find(x => x.customerCode == this.data.data1.customerCode).name;
    });
    this.employeeService.getAllEmployees().subscribe(data => {
      this.EmployeeList = data;
      this.employeeName = data.find(x => x.employeeCode == this.data.data1.employeeCode).name;
    });

  }
}
