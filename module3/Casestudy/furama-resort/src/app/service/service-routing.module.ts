import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ServiceListComponent} from "./service-list/service-list.component";
import {ServiceCreateComponent} from "./service-create/service-create.component";


const routes: Routes = [
  {
    path: 'service/list',
    component: ServiceListComponent
  },
  {
    path: 'service/create',
    component: ServiceCreateComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ServiceRoutingModule {
}
