import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-contract-detail-create',
  templateUrl: './contract-detail-create.component.html',
  styleUrls: ['./contract-detail-create.component.css']
})
export class ContractDetailCreateComponent implements OnInit {
  createContractDetailForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.createContractDetailForm = this.fb.group({
      id: ['', Validators.required],
      idContract: ['', [Validators.required]],
      accompaniedService: [''],
      amount: ['']
    })
  }
onSubmit(){
    console.log(this.createContractDetailForm);
}
}
