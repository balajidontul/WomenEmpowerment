import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserRegistration } from './user-registration';

@Injectable({
  providedIn: 'root'
})
export class UserRegistrationService {

  private baseURL = "http://localhost:9000/rest/api/users";
  constructor(private httpClient:HttpClient) { }

  createUser(userRegistration: UserRegistration):Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, userRegistration);
  }

  getUsersList(): Observable<UserRegistration[]>{
    return this.httpClient.get<UserRegistration[]>(`${this.baseURL}`);
  }

}
