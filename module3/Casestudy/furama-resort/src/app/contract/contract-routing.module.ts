import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ContractListComponent} from "./contract-list/contract-list.component";
import {ContractCreateComponent} from "./contract-create/contract-create.component";
import {ContractDetailCreateComponent} from "./contract-detail-create/contract-detail-create.component";
import {ContractEditComponent} from "./contract-edit/contract-edit.component";


const routes: Routes = [
  {
    path: 'contract/list',
    component: ContractListComponent
  },
  {
    path: 'contract/create',
    component: ContractCreateComponent
  },
  {
    path: 'contract/contractdetailcreate',
    component: ContractDetailCreateComponent
  },
  {
    path: 'contract/edit/:id',
    component: ContractEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ContractRoutingModule {
}
