import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../services/customer.service";
import { Router } from '@angular/router';
import {ICustomer} from "../../interface/ICustomer";
import {DatePipe} from "@angular/common";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  private createCustomerForm: FormGroup;
  private maxDate = new Date();
  private minDate = new Date(1900,0,1);

  constructor(private fb: FormBuilder,
              public customerService: CustomerService,
              public router: Router) {
  }

  ngOnInit() {
    this.createCustomerForm = this.fb.group({
      customerCode: ['', [Validators.required, Validators.pattern('^(KH\-)[0-9]{4}$')]],
      name: ['', Validators.required],
      birthday: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^([1-9]{1}[0-9]{8}|[1-9]{1}[0-9]{11})$')]],
      phoneNumber: ['', [Validators.required, Validators.pattern('^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)+[0-9]{7}$')]],
      email: ['', [Validators.email, Validators.required, Validators.pattern('^[a-zA-Z]{1}[a-zA-Z0-9\\_]{1,100}\\@[a-zA-Z]{2,10}\\.[a-zA-Z]{2,10}$')]],
      address: ['', Validators.required],
      typeCustomer: ['',Validators.required]
    })
  };

  onSubmit() {
    let customer = this.createCustomerForm.value as ICustomer;
    // let datePipe = new DatePipe('en-Us');
    // customer.birthday = datePipe.transform(customer.birthday, 'dd/MM/yyyy');

    this.customerService.addNewCustomer(customer).subscribe(
      data => {
        this.router.navigateByUrl('customer/list');
        alert("Thêm mới thành công!");
      }
    );
  }

}
