import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginComponent } from 'src/app/login/login.component';
import { Ngo } from '../ngo';
import { NgoService } from '../ngo.service';
import { Project } from '../project';

@Component({
  selector: 'app-registerngo',
  templateUrl: './registerngo.component.html',
  styleUrls: ['./registerngo.component.css']
})
export class RegisterngoComponent implements OnInit {
  OrganisationReg:Ngo
  OrgIdObj:Ngo
  ProjectDet: Project
  orgkey:number
  dummypass:string

  loc:String

  constructor (private ngoService:NgoService, private router:Router) 
  {
    this.OrganisationReg=new Ngo();
    this.ProjectDet=new Project();
   }

  ngOnInit(): void {
  }

  formSubmit(regForm:any)
  {
    
    this.OrganisationReg.status="Pending";
    //console.log("Form value: "+regForm.value);
    //console.log(this.OrganisationReg);
    //console.log(this.ProjectDet);
    this.ngoService.addNgo(this.OrganisationReg).subscribe(
      (data)=>{
        console.log("Return Value from REST"+data);
        this.OrganisationReg=data as Ngo;
        this.orgkey=this.OrganisationReg.organisationId;
        //alert("Please note your Organisation ID: "+this.orgkey+"\nPlease use it for future login!")
        this.ngoService.addProj(this.ProjectDet,this.orgkey).subscribe(
          (data2) => {console.log("Proj data: "+data2)}
        );
      }
    ) 
    //this.ngoService.addProj(this.ProjectDet,this.orgkey).subscribe();
    alert("NGO sent for Admin approval!");
    this.router.navigate(['/ngologin']);
  }

  login()
  {
    this.router.navigate(['/ngologin']);
  }

}
