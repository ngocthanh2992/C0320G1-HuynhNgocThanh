import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ServiceRoutingModule } from './service-routing.module';
import {ServiceListComponent} from "./service-list/service-list.component";
import {ServiceCreateComponent} from "./service-create/service-create.component";
import {ReactiveFormsModule} from "@angular/forms";


@NgModule({
  declarations: [ServiceListComponent,ServiceCreateComponent],
  imports: [
    CommonModule,
    ServiceRoutingModule,
    ReactiveFormsModule
  ]
})
export class ServiceModule { }
