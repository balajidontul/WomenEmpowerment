import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ngo } from './ngo';

@Injectable({
  providedIn: 'root'
})
export class NgoService {

  private baseURL = "http://localhost:9000/rest/api/";
  constructor(private httpClient:HttpClient) {}

  getPendingNgoList(): Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`${this.baseURL}/pending-ngo`);
  }

  getApprovedNgoList(): Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`${this.baseURL}/approved-ngo`);
  }

  approvePendingNgo(organisationId:number){
    return this.httpClient.put(`${this.baseURL}pending-ngo/${organisationId}`, organisationId);
  }

  deletePendingNgo(organisationId:number){
    return this.httpClient.delete(`${this.baseURL}pending-ngo/${organisationId}`);
  }

  deleteNgo(organisationId:number){
    return this.httpClient.delete(`${this.baseURL}approved-ngo/${organisationId}`);
  }

  getallngo():Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`${this.baseURL}Organisation`);
  }

}
