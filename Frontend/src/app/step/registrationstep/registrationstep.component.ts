import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Coursedetails } from '../coursedetails';
import { Familydetails } from '../familydetails';
import { Personaldetails } from '../personaldetails';
import { StepService } from '../step.service';

@Component({
  selector: 'app-registrationstep',
  templateUrl: './registrationstep.component.html',
  styleUrls: ['./registrationstep.component.css']
})
export class RegistrationstepComponent implements OnInit {

  personaldetail : Personaldetails;
  familydetail : Familydetails;
  coursedetail : Coursedetails;

  constructor( private stepservice : StepService, private router : Router) { }

  ngOnInit(): void {
  }

  savepersonalDetails(){
    this.stepservice.PushallPersonalDetails(this.personaldetail).subscribe(data =>{
      console.log(data);
    }, error => console.log(error));
    window.alert("Personal details saved successfully");
  }

  savefamilyDetails(){
    this.stepservice.PushallFamilyDetails(this.familydetail).subscribe(data =>{
      console.log(data);
    }, error => console.log(error));
    window.alert("Family details saved successfully");
  }

  // savecourseDetails(){
  //   this.stepservice.PushallCourseDetails(this.coursedetail).subscribe(data =>{
  //     console.log(data);
  //   }, error => console.log(error));
  //   window.alert("Personal details saved successfully");
  // }



  onSubmit()
  {
    this.savepersonalDetails();
    this.savefamilyDetails();
    
  }

}
