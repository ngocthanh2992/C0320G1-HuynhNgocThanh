import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ServiceService} from "../../services/service.service";
import {CustomerService} from "../../services/customer.service";
import {Router} from "@angular/router";


@Component({
  selector: 'app-service-create',
  templateUrl: './service-create.component.html',
  styleUrls: ['./service-create.component.css']
})
export class ServiceCreateComponent implements OnInit {
  createServiceForm: FormGroup;

  constructor(private fb: FormBuilder,
              public serviceService: ServiceService,
              public router: Router) {
  }

  ngOnInit() {
    this.createServiceForm = this.fb.group({
      serviceCode: ['', [Validators.required, Validators.pattern('^DV\-[0-9]{4}$')]],
      name: ['', [Validators.required]],
      area: ['', [Validators.required,
        Validators.pattern('^[1-9]{1}[0-9]{0,3}$')]],
      numberOfFloor: ['', [Validators.required,
        Validators.pattern('^[1-9]{1}[0-9]{0,3}$')]],
      maximumPeople: ['', [Validators.required,
        Validators.pattern('^[1-9]{1}[0-9]{0,3}$')]],
      rent: ['', [Validators.required,
        Validators.pattern('^[1-9]{1}[0-9]{1,}$')]],
      typeRent: ['', [Validators.required]],
      status: ['', Validators.required],
      typeService: ['', [Validators.required]]
    })
  }

  onSubmit() {
    this.serviceService.addNewService(this.createServiceForm.value).subscribe(data=>{
      this.router.navigateByUrl('service/list');
      alert("Thêm mới thành công!")
    });
  }
}
