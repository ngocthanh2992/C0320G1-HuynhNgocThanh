import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ContractService} from "../../services/contract.service";
import {ActivatedRoute, Router} from "@angular/router";
import {EmployeeService} from "../../services/employee.service";
import {CustomerService} from "../../services/customer.service";
import {ServiceService} from "../../services/service.service";

@Component({
  selector: 'app-contract-edit',
  templateUrl: './contract-edit.component.html',
  styleUrls: ['./contract-edit.component.css']
})
export class ContractEditComponent implements OnInit {

  editContractForm: FormGroup;
  private contractOfId;
  private EmployeeList;
  private CustomerList;
  private ServiceList;

  dateValidator(control: AbstractControl) {
    const startDate = new Date(control.get('dateMakeContract').value).getTime();
    const endDate = new Date(control.get('dateEndContract').value).getTime();
    return (endDate < startDate) ? {date: true} : null;
  }

  constructor(private fb: FormBuilder,
              public contractService: ContractService,
              public router: Router,
              public employeeService: EmployeeService,
              public customerSerVice: CustomerService,
              public serviceService: ServiceService,
              private activatedRoute: ActivatedRoute) {
  }

  ngOnInit() {
    this.editContractForm = this.fb.group({
      employeeCode: ['', [Validators.required]],
      customerCode: ['', [Validators.required]],
      serviceCode: ['', [Validators.required]],
      dateMakeContract: ['', [Validators.required]],
      dateEndContract: ['', [Validators.required]],
      deposit: ['', [Validators.required,
        Validators.pattern('^[0-9]{1,}$')]],
      totalAmount: ['']
    }, {validators :[this.dateValidator]});

    this.serviceService.getAllServices().subscribe(data => {
      this.ServiceList = data;
    });
    this.customerSerVice.getAllCustomers().subscribe(data => {
      this.CustomerList = data;
    });
    this.employeeService.getAllEmployees().subscribe(data => {
      this.EmployeeList = data;
    });
    this.activatedRoute.params.subscribe(data =>{
      this.contractOfId = data.id;
      this.contractService.getContractByID(this.contractOfId).subscribe(data =>{
        this.editContractForm.patchValue(data);
      });
    })
  }

  onSubmit() {
    this.contractService.editContract(this.editContractForm.value, this.contractOfId).subscribe(
      data => {
        this.router.navigateByUrl('contract/list');
        alert("Chỉnh sửa thành công!");
      }
    );
  }

  totalMoney() {
    const startDate = new Date(this.editContractForm.get('dateMakeContract').value).getTime();
    const endDate = new Date(this.editContractForm.get('dateEndContract').value).getTime();
    const totalDate = (endDate - startDate) / (24 * 3600 * 1000);
  }

}
