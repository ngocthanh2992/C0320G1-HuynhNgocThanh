// material.module.ts

import { NgModule } from '@angular/core';
import { MatDatepickerModule,
  MatNativeDateModule,
  MatFormFieldModule,
  MatInputModule } from '@angular/material';
import {MatDialogModule} from "@angular/material/dialog";
import {CustomerDeleteComponent} from "./customer/customer-delete/customer-delete.component";
import {CustomerDetailComponent} from "./customer/customer-detail/customer-detail.component";
import {CustomerCreateComponent} from "./customer/customer-create/customer-create.component";
import {CustomerEditComponent} from "./customer/customer-edit/customer-edit.component";
import {EmployeeCreateComponent} from "./employee/employee-create/employee-create.component";

@NgModule({
  imports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    MatDialogModule
  ],
  exports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    MatDialogModule
  ],
  providers: [ MatDatepickerModule ],
  entryComponents: []
})

export class MaterialModule {}
