import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ngocourse } from '../ngocourse';
import { NgocoursesService } from '../ngocourses.service';

@Component({
  selector: 'app-addcourse',
  templateUrl: './addcourse.component.html',
  styleUrls: ['./addcourse.component.css']
})
export class AddcourseComponent implements OnInit {

  ngocourse:Ngocourse = new Ngocourse();

  constructor(private ngoCoursesService:NgocoursesService, 
    private router:Router) { }

  ngOnInit(): void {
  }

  saveCourse() {
    this.ngoCoursesService.addCourse(this.ngocourse).subscribe(data =>{
      console.log(data);
    }, error => console.log(error));
  
  }

  onSubmit() {
    console.log(this.ngocourse);
    this.saveCourse();
    window.alert("Coursed added");
  }

}
