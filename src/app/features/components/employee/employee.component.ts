import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { EmployeeService } from '../../services/employee.service';

@Component({
  selector: 'app-employee',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.scss'
})
export class EmployeeComponent {
  msg:string | undefined;
  employee = {
    name: '',
    designation: '',
    ctc: null,
    email: ''
  };

  constructor(private employeeService: EmployeeService, private router: Router) {}
  submitEmployee(){
    this.employeeService.saveEmployee(this.employee).subscribe((response)=>{
      console.log(response)
    })

  }

}
