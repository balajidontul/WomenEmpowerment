import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserRegistration } from './user-registration';
import { UserRegistrationService } from './user-registration.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  userRegistration: UserRegistration = new UserRegistration();
  constructor(private userRegistrationService:UserRegistrationService, 
    private router:Router) { }

  ngOnInit(): void {
  }

  saveUser() {
    this.userRegistrationService.createUser(this.userRegistration).subscribe(data =>{
      console.log(data);
    }, error => console.log(error));
    window.alert("User registered successfully");
    
  }

  
  onSubmit() {
    console.log(this.userRegistration);
    this.saveUser();
    this.router.navigate(['/userlogin']);
  }

  
  login() {
    this.router.navigate(['/userlogin']);
  }


}
