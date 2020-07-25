import {Component, OnInit} from '@angular/core';
import {CustomerService} from "../../services/customer.service";
import {EmployeeService} from "../../services/employee.service";
import {MatDialog} from "@angular/material/dialog";
import {CustomerDetailComponent} from "../../customer/customer-detail/customer-detail.component";
import {EmployeeDetailComponent} from "../employee-detail/employee-detail.component";
import {CustomerDeleteComponent} from "../../customer/customer-delete/customer-delete.component";
import {EmployeeDeleteComponent} from "../employee-delete/employee-delete.component";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  private employees;

  constructor(private employeeService: EmployeeService,
              public dialog: MatDialog) {
  }

  ngOnInit() {
    this.employeeService.getAllEmployees().subscribe(data => {
      this.employees = data;
      console.log(this.employees);
    })
  }

  openView(employeeId): void {
    this.employeeService.getEmployeeByID(employeeId).subscribe(dataOfEmployee => {
      const dialogRef = this.dialog.open(EmployeeDetailComponent, {
        width: '500px',
        data: {data1: dataOfEmployee},
        disableClose: true
      });
    })
  };

  openDialog(employeeId): void {
    this.employeeService.getEmployeeByID(employeeId).subscribe(dataOfEmployee =>{
      const dialogRef = this.dialog.open(EmployeeDeleteComponent, {
        width: '500px',
        data: {data1: dataOfEmployee},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });

    });
  }
}
