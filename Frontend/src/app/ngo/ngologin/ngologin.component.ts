import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Ngo } from '../ngo';
import { NgoService } from '../ngo.service';

@Component({
  selector: 'app-ngologin',
  templateUrl: './ngologin.component.html',
  styleUrls: ['./ngologin.component.css']
})
export class NgologinComponent implements OnInit {

  panid:string='';
  password:string='';
  backendpanid:String='';
  backendpassword:String='';
  organisation:Ngo;

  


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
        
  } ,error=> console.error(error));
    }

    if (this.panid ==this.backendpanid) {
      if (this.password == this.backendpassword) {
        
        this.router.navigate(['ngohome']); 
        alert("Logged in")
      } else {
        alert("Wrong Password");
      }
    } else {
      alert("Wrong PanID");
    }
      

}


}
