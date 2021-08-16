import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
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
    alert("NGO sent for Admin approval, you can toggle to other pages now safely!");
    this.OrganisationReg.status="Pending";
    //console.log("Form value: "+regForm.value);
    console.log(this.OrganisationReg);
    console.log(this.ProjectDet);
    this.ngoService.addNgo(this.OrganisationReg).subscribe(
      (data)=>{
        console.log("Return Value from REST"+data);
      }
    ) 
    this.ngoService.addProj(this.ProjectDet,1).subscribe();
  }

  onRegister() {
    this.router.navigate(['/ngologin']);
  }
}
