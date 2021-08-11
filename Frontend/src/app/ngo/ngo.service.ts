import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ngo } from './ngo';

@Injectable({
  providedIn: 'root'
})
export class NgoService {

  private baseURL = "http://localhost:9887/rest/api/";
  constructor(private httpClient:HttpClient) {}

  getPendingNgoList(): Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`${this.baseURL}/pending-ngo`);
  }

  getApprovedNgoList(): Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`${this.baseURL}/approved-ngo`);
  }
}
