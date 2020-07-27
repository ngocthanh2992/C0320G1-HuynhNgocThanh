import { Component, OnInit, Inject } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA} from "@angular/material/dialog";

@Component({
  selector: 'app-post-find',
  templateUrl: './post-find.component.html',
  styleUrls: ['./post-find.component.css']
})
export class PostFindComponent implements OnInit {

  public postDetail;

  constructor(
    public dialogRef: MatDialogRef<PostFindComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any) {
  }

  ngOnInit() {
    this.postDetail = this.data.data1;
  }

}
