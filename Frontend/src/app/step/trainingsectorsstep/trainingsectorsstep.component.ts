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

  courseName: NgoCourseDetails = new NgoCourseDetails();
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

  public changeValue() {
    localStorage.setItem('courseName', this.courseName.ngoCourseName);
    console.log(this.courseName.ngoCourseName);
  }

  public enroll() {
    window.alert("Course enrolled.");
  }

}
