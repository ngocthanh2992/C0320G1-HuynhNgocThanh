import { NgModule } from '@angular/core';
import { MatDatepickerModule,
  MatNativeDateModule,
  MatFormFieldModule,
  MatInputModule } from '@angular/material';
import {MatDialogModule} from "@angular/material/dialog";

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
