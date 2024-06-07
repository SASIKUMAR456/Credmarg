import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../../../environment';
import { Observable } from 'rxjs';
import { Vendors } from '../vendors';

@Injectable({
  providedIn: 'root'
})
export class VendorsService {

  constructor(private _http:HttpClient) { }


  saveVendors(vendors:any){
    return this._http.post(`${environment.BASE_URL}vendors/saveVendor`,vendors);
  }

  viewVendors():Observable<Vendors[]>{
    return this._http.get<Vendors[]>(`${environment.BASE_URL}vendors/viewVendors`)
  }

  viewAllVendorsEmail():Observable<Vendors[]>{
    return this._http.get<Vendors[]>(`${environment.BASE_URL}vendors/sentemailVendorsList`)
  }

}
