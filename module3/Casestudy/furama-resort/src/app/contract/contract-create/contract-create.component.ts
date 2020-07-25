import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../services/customer.service";
import {Router} from "@angular/router";
import {ContractService} from "../../services/contract.service";
import {EmployeeService} from "../../services/employee.service";
import {ServiceService} from "../../services/service.service";
import {take} from "rxjs/operators";

@Component({
  selector: 'app-contract-create',
  templateUrl: './contract-create.component.html',
  styleUrls: ['./contract-create.component.css']
})
export class ContractCreateComponent implements OnInit {
  createContractForm: FormGroup;
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
              public serviceService: ServiceService) {
  }

  ngOnInit() {
    this.createContractForm = this.fb.group({
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

  }

  onSubmit() {
    this.contractService.addNewContract(this.createContractForm.value).subscribe(
      data => {
        this.router.navigateByUrl('contract/list');
        alert("Thêm mới thành công!");
      }
    );
  }

  totalMoney() {
    const startDate = new Date(this.createContractForm.get('dateMakeContract').value).getTime();
    const endDate = new Date(this.createContractForm.get('dateEndContract').value).getTime();
    const totalDate = (endDate - startDate) / (24 * 3600 * 1000);
    }

}
