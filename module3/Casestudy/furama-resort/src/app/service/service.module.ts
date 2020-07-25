import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ServiceRoutingModule } from './service-routing.module';
import {ServiceListComponent} from "./service-list/service-list.component";
import {ServiceCreateComponent} from "./service-create/service-create.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {NgxPaginationModule} from "ngx-pagination";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MaterialModule} from "../material.module";
import { ServiceEditComponent } from './service-edit/service-edit.component';
import { ServiceDeleteComponent } from './service-delete/service-delete.component';
import { ServiceDetailComponent } from './service-detail/service-detail.component';


@NgModule({
  declarations: [ServiceListComponent,ServiceCreateComponent, ServiceEditComponent, ServiceDeleteComponent, ServiceDetailComponent],
  imports: [
    CommonModule,
    ServiceRoutingModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    MatDatepickerModule,
    MaterialModule,
    FormsModule
  ],
  entryComponents:[ServiceDetailComponent,ServiceDeleteComponent]
})
export class ServiceModule { }
