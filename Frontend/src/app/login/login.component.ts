import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  

  email:string;
  password:string;

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  checkLogin() {
    if(this.email=="admin@admin.com" && this.password=="admin") {
      this.router.navigate(['']);
      sessionStorage.setItem("uemail", this.email);
    }
    else {
      window.alert("Wrong email or password.");
      this.router.navigate(['/userlogin']);
    }
  }

  register() {
    this.router.navigate(['/userregister']);
  }

}


