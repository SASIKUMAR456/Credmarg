import { Component } from '@angular/core';
import { EmailServiceService } from '../../services/email-service.service';

@Component({
  selector: 'app-send-emails',
  standalone: true,
  imports: [],
  templateUrl: './send-emails.component.html',
  styleUrl: './send-emails.component.scss'
})
export class SendEmailsComponent {

  constructor(private emai : EmailServiceService){}

  ngOnInit(): void {
    this.sentEmails();
  }

  sentEmails(){
    this.emai.sentEmails().subscribe((response)=>{
      console.log(response);
    })

  }
}
