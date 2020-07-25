import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ContractRoutingModule } from './contract-routing.module';
import {ContractListComponent} from "./contract-list/contract-list.component";
import {ContractCreateComponent} from "./contract-create/contract-create.component";
import {ContractDetailCreateComponent} from "./contract-detail-create/contract-detail-create.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {NgxPaginationModule} from "ngx-pagination";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MaterialModule} from "../material.module";
import { ContractDeleteComponent } from './contract-delete/contract-delete.component';
import { ContractEditComponent } from './contract-edit/contract-edit.component';
import { ContractDetailComponent } from './contract-detail/contract-detail.component';
import {CustomerDeleteComponent} from "../customer/customer-delete/customer-delete.component";
import {CustomerDetailComponent} from "../customer/customer-detail/customer-detail.component";


@NgModule({
  declarations: [ContractListComponent,ContractCreateComponent,ContractDetailCreateComponent, ContractDeleteComponent, ContractEditComponent, ContractDetailComponent],
  imports: [
    CommonModule,
    ContractRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    MatDatepickerModule,
    MaterialModule,
  ],
  entryComponents:[  ContractDeleteComponent, ContractDetailComponent]
})
export class ContractModule { }
