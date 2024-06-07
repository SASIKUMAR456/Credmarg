import { Component } from '@angular/core';
import { VendorsService } from '../vendors/vendors.service';
import { Vendors } from '../vendors';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-view-vendors',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './view-vendors.component.html',
  styleUrl: './view-vendors.component.scss'
})
export class ViewVendorsComponent {

  vendorsView: Vendors[] = [];
  constructor(private ven : VendorsService){}

  ngOnInit(): void {
    this.getVendors();
  }

  getVendors():void{
    this.ven.viewVendors().subscribe((data:Vendors[])=>{
      this.vendorsView=data;
    })
  }

}
