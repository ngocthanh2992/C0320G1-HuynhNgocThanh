import { Component, OnInit } from '@angular/core';
import {ServiceService} from "../../../../../Casestudy/furama-resort/src/app/services/service.service";
import {ServiceDeleteComponent} from "../../../../../Casestudy/furama-resort/src/app/service/service-delete/service-delete.component";
import {SaleService} from "../sale.service";
import { MatDialog } from '@angular/material/dialog';
import {CustomerDetailComponent} from "../../../../../Casestudy/furama-resort/src/app/customer/customer-detail/customer-detail.component";
import {PostFindComponent} from "../post-find/post-find.component";

@Component({
  selector: 'app-post-list',
  templateUrl: './post-list.component.html',
  styleUrls: ['./post-list.component.css']
})
export class PostListComponent implements OnInit {

  public posts;
  constructor(public saleService: SaleService,
              public dialog: MatDialog) { }

  ngOnInit() {
    this.saleService.getAllPost().subscribe(
      data => {this.posts = data;
        console.log(this.posts);
      })
  }

  openDialog() {
    this.saleService.getAllPost().subscribe(dataOfPost =>{
      const dialogRef = this.dialog.open(PostFindComponent, {
        width: '900px',
        data: {data1: dataOfPost},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
      });

    });
  }
}
