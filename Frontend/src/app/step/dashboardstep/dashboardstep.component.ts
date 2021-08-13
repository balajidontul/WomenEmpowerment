import { Component, OnInit } from '@angular/core';
import { StepService } from '../step.service';
import { Router } from '@angular/router';
import { Coursedetails } from '../coursedetails';

@Component({
  selector: 'app-dashboardstep',
  templateUrl: './dashboardstep.component.html',
  styleUrls: ['./dashboardstep.component.css']
})
export class DashboardstepComponent implements OnInit {

  courses : Coursedetails[]

  constructor(private stepService : StepService, private router : Router) { }

  ngOnInit(): void {


  }
  private getall() {
    this.stepService.getallcourses().subscribe(data => {
      this.courses = data;
      console.log(data.values);
    })

    this.router.navigate(['stepdashboard']);
  }

}
