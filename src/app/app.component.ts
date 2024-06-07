import { Component } from '@angular/core';
import { Router, RouterModule, RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './core/components/login/login.component';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule,RouterModule,FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})

export class AppComponent {
  
  title = 'credmarg_v1';

  // isLoggedIn: boolean = false;
  // constructor(private router: Router) {}
  // updateLoginStatus(isLoggedIn: boolean) {
  //   this.isLoggedIn = isLoggedIn;
  //   console.log('Is logged in:', this.isLoggedIn);
  //   console.log('Current route:', this.router.url);
  // }
}
