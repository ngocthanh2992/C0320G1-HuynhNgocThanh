import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ServiceService} from "../../services/service.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-service-edit',
  templateUrl: './service-edit.component.html',
  styleUrls: ['./service-edit.component.css']
})
export class ServiceEditComponent implements OnInit {
  private serviceOfId;
  private editServiceForm: FormGroup;

  constructor(private fb: FormBuilder,
              public serviceService: ServiceService,
              public router: Router,
              private activatedRoute: ActivatedRoute) {
  }

  ngOnInit() {
    this.editServiceForm = this.fb.group({
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
    this.activatedRoute.params.subscribe(data =>{
      this.serviceOfId = data.id;
      this.serviceService.getServiceByID(this.serviceOfId).subscribe(data =>{
        this.editServiceForm.patchValue(data);
      });
    })
  }

  onSubmit() {
    this.serviceService.editService(this.editServiceForm.value, this.serviceOfId).subscribe(data =>{
      this.router.navigateByUrl('service/list');
      alert("Sửa thông tin thành công!");
    });
  }

}
