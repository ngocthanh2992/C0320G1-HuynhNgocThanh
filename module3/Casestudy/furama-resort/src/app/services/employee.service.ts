import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public API_EMPLOYEE_URL = 'http://localhost:3000/employees';
  constructor(public http: HttpClient) { }

  getAllEmployees(): Observable<any>{
    return this.http.get(this.API_EMPLOYEE_URL);
  }

  addNewEmployee(employee): Observable<any>{
    return this.http.post(this.API_EMPLOYEE_URL, employee);
  }

  getEmployeeByID(employeeId): Observable<any>{
    return this.http.get(this.API_EMPLOYEE_URL + '/' + employeeId);
  }

  deleteEmployee(employeeId): Observable<any>{
    return this.http.delete(this.API_EMPLOYEE_URL+'/'+employeeId);
  }

  editEmployee(employee, employeeId): Observable<any>{
    return this.http.put(this.API_EMPLOYEE_URL + '/'+ employeeId, employee);
  }
}
