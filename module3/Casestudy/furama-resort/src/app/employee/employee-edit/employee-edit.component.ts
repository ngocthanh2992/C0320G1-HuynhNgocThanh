import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../services/employee.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
  private employeeOfId;
  editEmployeeForm: FormGroup;
  private maxDate = new Date();
  private minDate = new Date(1900,0,1);

  constructor(private fb: FormBuilder,
              private employeeService: EmployeeService,
              private router: Router,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.editEmployeeForm = this.fb.group({
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
    });
    this.activatedRoute.params.subscribe(data =>{
      this.employeeOfId = data.id;
      this.employeeService.getEmployeeByID(this.employeeOfId).subscribe(data =>{
        this.editEmployeeForm.patchValue(data);
      })
    })
  }

  onSubmit() {
    this.employeeService.editEmployee(this.editEmployeeForm.value, this.employeeOfId).subscribe(data =>{
      this.router.navigateByUrl('employee/list')
      alert("Chỉnh sửa thành công")
    })
  }
}
