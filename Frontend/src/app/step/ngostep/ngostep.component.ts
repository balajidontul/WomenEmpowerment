import { Component, OnInit } from '@angular/core';
import { StepService } from '../step.service';
import { Router } from '@angular/router';
import {NgoDetails} from '../ngodetails';


@Component({
  selector: 'app-ngostep',
  templateUrl: './ngostep.component.html',
  styleUrls: ['./ngostep.component.css']
})
export class NgostepComponent implements OnInit {

  NgoNames: NgoDetails[];
  constructor(private stepService : StepService, private router : Router) { }

  ngOnInit(): void {
    this.getAllNgos();
  }

  getAllNgos() {
     this.stepService.getAllNgos().subscribe(data => {
      console.log(data);
      this.NgoNames = data;
    })
  }

}
