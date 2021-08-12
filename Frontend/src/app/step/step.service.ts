import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Personaldetails } from './personaldetails';


@Injectable({
  providedIn: 'root'
  
})
export class StepService {

  
  private baseURL = "http://localhost:8084/rest/api/";
  constructor(private httpClient:HttpClient) {}

  PushallPersonalDetaails():Observable<Personaldetails>{
    return this.httpClient.get<Personaldetails>(`${this.baseURL}personaldetail`);
    console.log(Personaldetails);
  }

}
