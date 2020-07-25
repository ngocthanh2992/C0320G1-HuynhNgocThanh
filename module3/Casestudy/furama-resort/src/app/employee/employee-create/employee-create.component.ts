import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../services/employee.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {
  createEmployeeForm: FormGroup;
  private maxDate = new Date();
  private minDate = new Date(1900,0,1);
  constructor(private fb: FormBuilder,
              private employeeService: EmployeeService,
              private router: Router) { }

  ngOnInit() {
    this.createEmployeeForm = this.fb.group({
      employeeCode: ['', [Validators.required, Validators.pattern('^(NV\-)[0-9]{4}$')]],
      name: ['',Validators.required],
      birthday: ['', Validators.required],
      idCard: ['', [Validators.required,
        Validators.pattern('^([1-9]{1}[0-9]{8}|[1-9]{1}[0-9]{11})$')]],
      phoneNumber: ['', [Validators.required,
        Validators.pattern('^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)+[0-9]{7}$')]],
      email: ['', [Validators.required,
        Validators.pattern('^[a-zA-Z]{1}[a-zA-Z0-9\\_]{1,100}\\@[a-zA-Z]{2,10}\\.[a-zA-Z]{2,10}$')]],
      address: ['', Validators.required],
      position: ['', Validators.required],
      level: ['', Validators.required],
      part: ['', Validators.required],
      salary: ['', [Validators.required,
        Validators.pattern('^[1-9]{1}[0-9]+$')]],
    })
  }
  onSubmit(){
    this.employeeService.addNewEmployee(this.createEmployeeForm.value).subscribe(data =>{
      this.router.navigateByUrl('employee/list');
      alert("Thêm mới nhân viên thành công!")
    });
  }
}

