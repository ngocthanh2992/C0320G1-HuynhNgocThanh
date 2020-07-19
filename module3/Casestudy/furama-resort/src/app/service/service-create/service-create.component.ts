import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from "@angular/forms";

function compareID(c: AbstractControl) {
  const v = c.value;
  return (v.id === v.idTypeService) ? null : {
    idmatch: true
  };
}

@Component({
  selector: 'app-service-create',
  templateUrl: './service-create.component.html',
  styleUrls: ['./service-create.component.css']
})
export class ServiceCreateComponent implements OnInit {
  createServiceForm: FormGroup;
  constructor(private fb: FormBuilder) {
  }

  ngOnInit() {
    this.createServiceForm = this.fb.group({
      idGroup: this.fb.group({
        idTypeService: ['',Validators.required],
        id: ['', [Validators.required, Validators.pattern('^(DV\-)[0-9]{4}$')]],
      }, {validator: compareID}),
      name: ['', [Validators.required]],
      area: ['', [Validators.required,
        Validators.pattern('^[1-9]{1}[0-9]{0,3}$')]],
      numberOfFloor: ['', [Validators.required,
        Validators.pattern('^[1-9]{1}[0-9]{0,3}$')]],
      maximumPeople: ['', [Validators.required,
        Validators.pattern('^[1-9]{1}[0-9]{0,3}$')]],
      rent: ['', [Validators.required,
        Validators.pattern('^[1-9]{1}[0-9]{0,5}$')]],
      idTypeRent: ['', [Validators.required]],
      status: ['', Validators.required],
    })
  }
onSubmit(){
    console.log(this.createServiceForm);
}
}
