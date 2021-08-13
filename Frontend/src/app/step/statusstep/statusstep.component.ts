import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Coursedetails } from '../coursedetails';
import { StepService } from '../step.service';

@Component({
  selector: 'app-statusstep',
  templateUrl: './statusstep.component.html',
  styleUrls: ['./statusstep.component.css']
})
export class StatusstepComponent implements OnInit {
  CourseStatus: Coursedetails;
  constructor(private stepService: StepService, private router: Router) { }

  ngOnInit(): void {
    this.getStatus();
  }

  getStatus() {
    this.stepService.getAllStatus().subscribe(data => {
      console.log(data);
      
      this.CourseStatus = data;
    })
  }

}
