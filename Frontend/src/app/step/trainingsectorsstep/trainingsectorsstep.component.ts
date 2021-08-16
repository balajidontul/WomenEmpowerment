import { Component, OnInit } from '@angular/core';
import { StepService } from '../step.service';
import { Router } from '@angular/router';
import {NgoCourseDetails} from '../ngocoursedetails'

@Component({
  selector: 'app-trainingsectorsstep',
  templateUrl: './trainingsectorsstep.component.html',
  styleUrls: ['./trainingsectorsstep.component.css']
})
export class TrainingsectorsstepComponent implements OnInit {

  CourseNames: NgoCourseDetails[];
  constructor(private stepService: StepService, private router: Router) { }

  ngOnInit(): void {
    this.getAllNgos();
  }

  private getAllNgos() {
    this.stepService.getAllNgocourses().subscribe(data => {
      console.log(data);
      this.CourseNames = data;
    })
  }

  public enrollCourse(){
    window.alert("Course enrolled, please wait for approval from NGO.");
  }

}
