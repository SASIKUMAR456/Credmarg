import { Component } from '@angular/core';
import { VendorsService } from './vendors.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-vendors',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './vendors.component.html',
  styleUrl: './vendors.component.scss'
})
export class VendorsComponent {
vendors = {
  name: '',
  email: '',
  upi: ''
};
  constructor(private vendorsService : VendorsService){}

  saveVendor(): void{
      this.vendorsService.saveVendors(this.vendors).subscribe((response) =>{
        console.log(response);
      });
  }

}
