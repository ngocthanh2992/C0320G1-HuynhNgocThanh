import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-contract-create',
  templateUrl: './contract-create.component.html',
  styleUrls: ['./contract-create.component.css']
})
export class ContractCreateComponent implements OnInit {
  createContractForm: FormGroup;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit() {
    this.createContractForm = this.fb.group({
      id: ['', Validators.required],
      idEmployee: ['', [Validators.required]],
      idCustomer: ['', [Validators.required]],
      idService: ['', [Validators.required]],
      dateMakeContract: ['', Validators.required, Validators.pattern('^(0[1-9]|[12][0-9]|3[01])[-\/](0[1-9]|1[012])[-\/](19|20)\d\d$')],
      dateEndContract: ['', Validators.required, Validators.pattern('^(0[1-9]|[12][0-9]|3[01])[-\/](0[1-9]|1[012])[-\/](19|20)\d\d$')],
      deposit: ['', [Validators.required,
        Validators.pattern('^[0-9]{1,}$')]],
      totalAmount: ['']
    })
  }

  onSubmit() {
    console.log(this.createContractForm)
  }
}
