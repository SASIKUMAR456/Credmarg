import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../../environment';

@Injectable({
  providedIn: 'root'
})
export class EmailServiceService {

  constructor(private _http:HttpClient) { }

  sentEmails(){
    return this._http.get(`${environment.BASE_URL}emailSend/sendEmails`);
  }

}
