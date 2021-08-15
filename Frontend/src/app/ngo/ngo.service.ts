import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ngo } from './ngo';

@Injectable({
  providedIn: 'root'
})
export class NgoService {

  private baseURL = "http://localhost:9000/rest/api/adminhome";
  constructor(private httpClient:HttpClient) {}

  getPendingNgoList(): Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`${this.baseURL}/(adminsub:adminpending)`);
  }

  getApprovedNgoList(): Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`${this.baseURL}/(adminsub:adminapproved)`);
  }

  approvePendingNgo(organisationId:number){
    return this.httpClient.put(`${this.baseURL}/(adminsub:adminpending)/${organisationId}`, organisationId);
  }

  deletePendingNgo(organisationId:number){
    return this.httpClient.delete(`${this.baseURL}/(adminsub:adminpending)/${organisationId}`);
  }

  deleteNgo(organisationId:number){
    return this.httpClient.delete(`${this.baseURL}/(adminsub:adminapproved)/${organisationId}`);
  }

  getallngo():Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`${this.baseURL}Organisation`);
  }

}
