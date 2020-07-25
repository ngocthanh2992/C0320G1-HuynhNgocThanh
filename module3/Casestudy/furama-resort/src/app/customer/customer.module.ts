import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomerRoutingModule } from './customer-routing.module';
import {CustomerListComponent} from "./customer-list/customer-list.component";
import {CustomerCreateComponent} from "./customer-create/customer-create.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {NgxPaginationModule} from "ngx-pagination";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MaterialModule} from "../material.module";
import { CustomerDeleteComponent } from './customer-delete/customer-delete.component';
import { CustomerEditComponent } from './customer-edit/customer-edit.component';
import { CustomerDetailComponent } from './customer-detail/customer-detail.component';



@NgModule({
  declarations: [CustomerListComponent, CustomerCreateComponent, CustomerDeleteComponent, CustomerEditComponent, CustomerDetailComponent],
  imports: [
    CustomerRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    MatDatepickerModule,
    MaterialModule,
    CommonModule
  ],
  entryComponents:[  CustomerDeleteComponent, CustomerDetailComponent]
})
export class CustomerModule { }
