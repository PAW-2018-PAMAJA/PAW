import { Component, OnInit } from '@angular/core';
import { AppAuthenticationServis } from 'src/app/services/app-authentication.service';
import { User } from '../user';

@Component({
  selector: 'app-log-in-screen',
  templateUrl: './log-in-screen.component.html',
  styleUrls: ['./log-in-screen.component.css']
})
export class LogInScreenComponent implements OnInit {

  constructor(private service: AppAuthenticationServis) { }

  ngOnInit() {
  }

  logIn(username,password) {
      this.service.login(username,password);
  }

}
