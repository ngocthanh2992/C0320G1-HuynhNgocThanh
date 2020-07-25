import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ContractService {

  public API: string = 'http://localhost:3000/contracts';

  constructor(public http: HttpClient) { }

  getAllContracts(): Observable<any>{
    return this.http.get(this.API);
  }

  addNewContract(contract): Observable<any>{
    return this.http.post(this.API, contract);
  }

  getContractByID(contractId): Observable<any>{
    return this.http.get(this.API + '/' + contractId);
  }

  deleteContract(ContractId): Observable<any>{
    return this.http.delete(this.API+'/'+ContractId);
  }

  editContract(contract, ContractId): Observable<any>{
    return this.http.put(this.API + '/'+ ContractId, contract);
  }
}
