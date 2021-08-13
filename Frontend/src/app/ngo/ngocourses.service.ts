import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ngocourse } from './ngocourse';

@Injectable({
  providedIn: 'root'
})
export class NgocoursesService {

  private baseURL = "http://localhost:9000/rest/api/courses";
  constructor(private httpClient:HttpClient) { }

  addCourse(ngocourse: Ngocourse):Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, ngocourse);
  }


}
