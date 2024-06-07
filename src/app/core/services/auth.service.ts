import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { environment } from '../../../environment';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private _http:HttpClient) { }
  login(username:string,password:string):Observable<any>{
    const params = new HttpParams()
    .set('user',username)
    .set('password',password);
    return this._http.get<any>(`${environment.BASE_URL}auth/roles`,{params})
  }
}
