import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  createCustomerForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.createCustomerForm = this.fb.group({
      idCustomer: ['', Validators.required],
      customerCode: ['', [Validators.required, Validators.pattern('^(KH\-)[0-9]{4}$')]],
      name: ['',Validators.required],
      birthday: ['',[Validators.required, Validators.pattern('^(0[1-9]|[12][0-9]|3[01])[-\/](0[1-9]|1[012])[-\/](19|20)\d\d$')]],
      idCard: ['',[Validators.required, Validators.pattern('^([1-9]{1}[0-9]{8}|[1-9]{1}[0-9]{11})$')]],
      phoneNumber: ['',[ Validators.required, Validators.pattern('^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)+[0-9]{7}$')]],
      email: ['',[Validators.email, Validators.required, Validators.pattern('^[a-zA-Z]{1}[a-zA-Z0-9\\_]{1,100}\\@[a-zA-Z]{2,10}\\.[a-zA-Z]{2,10}$')]],
      address: ['',Validators.required],
      idTypeCustomer: ['',Validators.required]
    })
  };
  onSubmit(){
    console.log(this.createCustomerForm);
  }

}
