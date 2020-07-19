import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerListComponent } from './customer/customer-list/customer-list.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeListComponent } from './employee/employee-list/employee-list.component';
import { ServiceComponent } from './service/service.component';
import { ServiceListComponent } from './service/service-list/service-list.component';
import { ContractComponent } from './contract/contract.component';
import { ContractListComponent } from './contract/contract-list/contract-list.component';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';
import { EmployeeCreateComponent } from './employee/employee-create/employee-create.component';
import { ServiceCreateComponent } from './service/service-create/service-create.component';
import { ContractCreateComponent } from './contract/contract-create/contract-create.component';
import {ReactiveFormsModule} from "@angular/forms";
import { ContractDetailCreateComponent } from './contract/contract-detail-create/contract-detail-create.component';



@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    CustomerListComponent,
    EmployeeComponent,
    EmployeeListComponent,
    ServiceComponent,
    ServiceListComponent,
    ContractComponent,
    ContractListComponent,
    CustomerCreateComponent,
    EmployeeCreateComponent,
    ServiceCreateComponent,
    ContractCreateComponent,
    ContractDetailCreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
