import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Personaldetails } from './personaldetails';
import { Familydetails } from './familydetails';
import { Coursedetails } from './coursedetails';


@Injectable({
  providedIn: 'root'
  
})
export class StepService {

  
  private baseURL = "http://localhost:8084/rest/api/";
  constructor(private httpClient:HttpClient) {}

  PushallPersonalDetails(personaldetails : Personaldetails):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}personaldetail` , personaldetails);
    console.log(personaldetails);
  }

  PushallFamilyDetails(familydetails : Familydetails):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}familydetail` , familydetails);
    console.log(familydetails);

  }
  // PushallCourseDetails(coursedetails : Coursedetails):Observable<Object>{
  //   return this.httpClient.post(`${this.baseURL}coursedetail` , coursedetails);
  //   console.log(coursedetails);

  // }

  getallcourses():Observable<Coursedetails[]>{
    return this.httpClient.get<Coursedetails[]>(`${this.baseURL}courses`);
  }

  // nisha
  getAllStatus(): Observable<Coursedetails> {
    return this.httpClient.get<Coursedetails>(`${this.baseURL}courses`);
  }



}
