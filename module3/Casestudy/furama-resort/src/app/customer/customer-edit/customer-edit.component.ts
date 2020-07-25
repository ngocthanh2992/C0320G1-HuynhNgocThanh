import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../services/customer.service";
import {ActivatedRoute, Router} from '@angular/router';
import {ICustomer} from "../../interface/ICustomer";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {

  private customerOfId;
  private editCustomerForm: FormGroup;
  private maxDate = new Date();
  private minDate = new Date(1900,0,1);

  constructor(private fb: FormBuilder,
              public customerService: CustomerService,
              public router: Router,
              private activatedRoute: ActivatedRoute) {
  }

  ngOnInit() {
    this.editCustomerForm = this.fb.group({
      customerCode: ['', [Validators.required, Validators.pattern('^(KH\-)[0-9]{4}$')]],
      name: ['', Validators.required],
      birthday: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^([1-9]{1}[0-9]{8}|[1-9]{1}[0-9]{11})$')]],
      phoneNumber: ['', [Validators.required, Validators.pattern('^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)+[0-9]{7}$')]],
      email: ['', [Validators.email, Validators.required, Validators.pattern('^[a-zA-Z]{1}[a-zA-Z0-9\\_]{1,100}\\@[a-zA-Z]{2,10}\\.[a-zA-Z]{2,10}$')]],
      address: ['', Validators.required],
      typeCustomer: ['',Validators.required]
    });

    this.activatedRoute.params.subscribe(data =>{
      this.customerOfId = data.id;
      this.customerService.getCustomerByID(this.customerOfId).subscribe(data =>{
        this.editCustomerForm.patchValue(data);
      });
    })
  };

  onSubmit() {
  this.customerService.editCustomer(this.editCustomerForm.value, this.customerOfId).subscribe(data =>{
    this.router.navigateByUrl('customer/list');
    alert("Sửa thông tin thành công!");
  });
  }
}
