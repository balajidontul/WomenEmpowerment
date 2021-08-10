import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registerngo',
  templateUrl: './registerngo.component.html',
  styleUrls: ['./registerngo.component.css']
})
export class RegisterngoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  formSubmit(regForm:any)
  {
  	console.log("Form working fine");
  }

}
