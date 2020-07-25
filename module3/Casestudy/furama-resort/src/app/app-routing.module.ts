import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import {HomeComponent} from "./home/home.component";


const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
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
