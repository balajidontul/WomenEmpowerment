import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ngo } from './ngo';
import { Project } from './project';

@Injectable({
  providedIn: 'root'
})
export class NgoService {

  private baseURL = "http://localhost:9000/rest/api/";
  constructor(private httpClient:HttpClient) {}

  getPendingNgoList(): Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`${this.baseURL}adminhome/(adminsub:adminpending)`);
  }

  getApprovedNgoList(): Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`${this.baseURL}adminhome/(adminsub:adminapproved)`);
  }

  approvePendingNgo(organisationId:number){
    return this.httpClient.put(`${this.baseURL}adminhome/(adminsub:adminpending)/${organisationId}`, organisationId);
  }

  deletePendingNgo(organisationId:number){
    return this.httpClient.delete(`${this.baseURL}adminhome/(adminsub:adminpending)/${organisationId}`);
  }

  deleteNgo(organisationId:number){
    return this.httpClient.delete(`${this.baseURL}adminhome/(adminsub:adminapproved)/${organisationId}`);
  }

  getallngo():Observable<Ngo[]>{
    return this.httpClient.get<Ngo[]>(`http://localhost:9000/rest/api/Organisation`);
  }

  addNgo(newOrg:Ngo){
    return this.httpClient.post(`${this.baseURL}Organisation`,newOrg);
  }

  addProj(newProj:Project, orgId:number){
    return this.httpClient.post(`${this.baseURL}project-incharge/${orgId}`,newProj);
  }


  getStatusofNGO(pan:String):Observable<String>{

    return this.httpClient.get<String>(`http://localhost:9000/rest/api/Organisation/${pan}`);
  }

}
