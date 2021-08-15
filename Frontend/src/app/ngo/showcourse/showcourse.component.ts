import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ngocourse } from '../ngocourse';
import { NgocoursesService } from '../ngocourses.service';

@Component({
  selector: 'app-showcourse',
  templateUrl: './showcourse.component.html',
  styleUrls: ['./showcourse.component.css']
})
export class ShowcourseComponent implements OnInit {

  ngoCourses:Ngocourse[];
  constructor(private ngoCoursesService:NgocoursesService, 
    private router:Router) { }

  ngOnInit(): void {
    this.showCourse();
  }

  private showCourse() {
    this.ngoCoursesService.showNgoCourse().subscribe(data => {
      this.ngoCourses = data;
    })
  }

}
