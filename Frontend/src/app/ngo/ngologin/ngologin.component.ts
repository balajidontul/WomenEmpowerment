import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Ngo } from '../ngo';
import { NgoService } from '../ngo.service';
import { Ngologinmanagement } from '../ngologinmanagement';

@Component({
  selector: 'app-ngologin',
  templateUrl: './ngologin.component.html',
  styleUrls: ['./ngologin.component.css']
})
export class NgologinComponent implements OnInit {

  panid:string='';
  password:string='';
  backendpanid:String='temp';
  backendpassword:String='1234';
  organisation:Ngo;
  loginmanagement:Ngologinmanagement;
  


  constructor(private router: Router, private route: ActivatedRoute,private ngoService:NgoService) { }

  ngOnInit(): void {
  }








  check(){
    console.log("started");
    
    if (this.panid=='') {
      alert('PAN ID cant be Null');
    } else {
      
      this.ngoService.getStatusofNGO(this.panid).subscribe(data=>{
        console.log(data);
        this.organisation=data;
        this.backendpanid = this.organisation.pan;
        
       

        this.backendpassword = this.organisation.password;
        if (this.panid ==this.backendpanid && this.password == this.backendpassword) {
          alert("Logged in");
          
          this.router.navigate(['ngohome']);
          
        } else {
          alert("Wrong Crediential");
        }
        
  } ,error=> console.error(error));
    }

   
      

}


}
