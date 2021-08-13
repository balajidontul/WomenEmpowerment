import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-ngologin',
  templateUrl: './ngologin.component.html',
  styleUrls: ['./ngologin.component.css']
})
export class NgologinComponent implements OnInit {

  model: any = {};

  onSubmit() {
    alert(this.model.email)
  }


  constructor() { }

  ngOnInit(): void {
  }

}
