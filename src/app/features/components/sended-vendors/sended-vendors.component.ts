import { Component } from '@angular/core';
import { VendorsService } from '../vendors/vendors.service';
import { Vendors } from '../vendors';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-sended-vendors',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './sended-vendors.component.html',
  styleUrl: './sended-vendors.component.scss'
})
export class SendedVendorsComponent {

  sendedVendorsEmails:Vendors[]=[];
  constructor(private ven : VendorsService){}

  ngOnInit(): void {
    this.sendedVendors();
  }
  sendedVendors(){
    this.ven.viewAllVendorsEmail().subscribe((data:Vendors[])=>{
      this.sendedVendorsEmails=data;
    })
  }
}
