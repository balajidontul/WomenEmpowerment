import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  userName:string;
  password:string;

  constructor(private router:Router) { }


  ngOnInit(): void {
  }

  checkLogin() {
    if(this.userName=="admin" && this.password=="admin") {
      this.router.navigate(['/adminhome']);
      sessionStorage.setItem("uname", this.userName);
    }
    else {
      window.alert("Wrong username or password.");
      this.router.navigate(['/adminlogin']);
    }
  }

}
