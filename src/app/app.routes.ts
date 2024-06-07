import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './core/components/login/login.component';
import { DashboardComponent } from './features/components/dashboard/dashboard.component';
import { EmployeeComponent } from './features/components/employee/employee.component';
import { VendorsComponent } from './features/components/vendors/vendors.component';
import { ListEmployeeComponent } from './features/components/list-employee/list-employee.component';
import { NgModule } from '@angular/core';
import { ViewVendorsComponent } from './features/components/view-vendors/view-vendors.component';
import { SendEmailsComponent } from './features/components/send-emails/send-emails.component';
import { SendedVendorsComponent } from './features/components/sended-vendors/sended-vendors.component';

export const routes: Routes = [
    { path: 'login', component: LoginComponent },
    // { path: '**', redirectTo: '/login' },
    { path: '', redirectTo: 'login', pathMatch: 'full' },
    { path: 'dashboard', component: DashboardComponent },
    { path: 'employees', component: EmployeeComponent },
    { path: 'viewemployees', component: ListEmployeeComponent },
    { path: 'vendors', component: VendorsComponent },
    { path: 'viewvendors', component: ViewVendorsComponent },
    { path: 'sentEmails', component: SendEmailsComponent },
    { path: 'listsentemailsToVendors', component: SendedVendorsComponent },
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule {}