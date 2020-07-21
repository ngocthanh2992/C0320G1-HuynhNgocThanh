import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerListComponent } from './customer/customer-list/customer-list.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeListComponent } from './employee/employee-list/employee-list.component';
import { ServiceComponent } from './service/service.component';
import { ContractComponent } from './contract/contract.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { ContractDetailCreateComponent } from './contract/contract-detail-create/contract-detail-create.component';



@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    EmployeeComponent,
    ServiceComponent,
    ContractComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
