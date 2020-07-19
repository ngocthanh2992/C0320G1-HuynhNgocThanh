import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {
  createEmployeeForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.createEmployeeForm = this.fb.group({
      id: ['', [Validators.required, Validators.pattern('^(NV\-)[0-9]{4}$')]],
      name: ['',Validators.required],
      birthday: ['', [Validators.required,
        Validators.pattern('^(0[1-9]|[12][0-9]|3[01])[-\/](0[1-9]|1[012])[-\/](19|20)\d\d$')]],
      idCard: ['', [Validators.required,
        Validators.pattern('^([1-9]{1}[0-9]{8}|[1-9]{1}[0-9]{11})$')]],
      phoneNumber: ['', [Validators.required,
        Validators.pattern('^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)+[0-9]{7}$')]],
      email: ['', [Validators.required,
        Validators.pattern('^[a-zA-Z]{1}[a-zA-Z0-9\\_]{1,100}\\@[a-zA-Z]{2,10}\\.[a-zA-Z]{2,10}$')]],
      address: ['', Validators.required],
      idPosition: ['', Validators.required],
      idLevel: ['', Validators.required],
      idPart: ['', Validators.required],
      salary: ['', [Validators.required,
        Validators.pattern('^[1-9]{1}[0-9]+$')]],
    })
  }
  onSubmit(){
    console.log(this.createEmployeeForm);
  }
}

