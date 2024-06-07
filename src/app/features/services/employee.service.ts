import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../../environment';
import { Observable } from 'rxjs';
import { Employee } from '../employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private _http:HttpClient) { }

  saveEmployee(employee:any){
    return this._http.post(`${environment.BASE_URL}employee/saveEmployee`,employee);
  }

  viewEmployee():Observable<Employee[]>{
    return this._http.get<Employee[]>(`${environment.BASE_URL}employee/viewEmployees`)
  }

}
