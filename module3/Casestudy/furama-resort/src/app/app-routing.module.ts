import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerListComponent} from "./customer/customer-list/customer-list.component";
import {CustomerCreateComponent} from "./customer/customer-create/customer-create.component";
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


const routes: Routes = [
  {
  path: '',
  loadChildren: './customer/customer.module#CustomerModule'
},
  {
    path: '',
    loadChildren: './employee/employee.module#EmployeeModule'
  },
  {
    path: '',
    loadChildren: './service/service.module#ServiceModule'
  },
  {
    path: '',
    loadChildren: './contract/contract.module#ContractModule'
  },
  {
    path: '**',
    component: PageNotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  declarations: [PageNotFoundComponent]
})
export class AppRoutingModule { }
