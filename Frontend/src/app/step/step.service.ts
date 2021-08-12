import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class StepService {

  private baseURL = "http://localhost:8084/rest/api/";
  constructor() {}

}
