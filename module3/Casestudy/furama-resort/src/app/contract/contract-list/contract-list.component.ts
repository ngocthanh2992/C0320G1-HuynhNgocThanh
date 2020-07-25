import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../services/customer.service";
import {MatDialog} from "@angular/material/dialog";
import {CustomerDeleteComponent} from "../../customer/customer-delete/customer-delete.component";
import {CustomerDetailComponent} from "../../customer/customer-detail/customer-detail.component";
import {ContractService} from "../../services/contract.service";
import {ContractDeleteComponent} from "../contract-delete/contract-delete.component";
import {ContractDetailComponent} from "../contract-detail/contract-detail.component";

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {
  public contracts;
  constructor(public contractService: ContractService,
              public dialog: MatDialog) { }

  ngOnInit() {
    this.contractService.getAllContracts().subscribe(
      data => {this.contracts = data;
        console.log(this.contracts);
      })
  }

  openDialog(ContractId): void {

    this.contractService.getContractByID(ContractId).subscribe(dataOfContract =>{
      const dialogRef = this.dialog.open(ContractDeleteComponent, {
        width: '500px',
        data: {data1: dataOfContract},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });

    });


  }

  openView(ContractId):void {
    this.contractService.getContractByID(ContractId).subscribe(dataOfContract =>{
      const dialogRef = this.dialog.open(ContractDetailComponent, {
        width: '500px',
        data: {data1: dataOfContract},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
      });

    });

  }

}
