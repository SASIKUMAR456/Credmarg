import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { AuthService } from '../../services/auth.service';
import { DashboardComponent } from '../../../features/components/dashboard/dashboard.component';
import { AppRoutingModule } from '../../../app.routes';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule,CommonModule,RouterModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {

  username!: string;
  password!: string;

  constructor(private auth: AuthService, private router: Router) {}

  login() {
    this.auth.login(this.username, this.password).subscribe((response) => {
      console.log(response)
      if (response.role === 'ADMIN') {
        this.router.navigateByUrl('/dashboard');
      } else {
        console.log('Login failed');
      }
    });
  }

}
