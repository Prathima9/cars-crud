import { Component } from '@angular/core';
import { AuthenticationService } from './login/auth.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular and Spring Boot Cars CRUD POC';
  constructor(private router: Router, public authenticationService: AuthenticationService){ }
  
  
  logout(){
  	this.authenticationService.logout();
    this.router.navigate(['login']);
  }
}
