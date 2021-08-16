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
  backendpanid:String='ABC1234567';
  backendpassword:String='1234';
  organisation:Ngo;
  ngoserv:NgoService;
  


  constructor(private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
  }


  check( ){
  //   if (id=='') {
  //     alert('PAN ID cant be Null');
  //   } else {
  //     console.log(id);
  //     this.ngoserv.getStatusofNGO(id).subscribe(data=>{
  //       console.log(data);
  //       this.organisation=data;
  //       this.backendpanid = this.organisation.pan;
  //       this.backendpassword = this.organisation.password;
        
  // } ,error=> console.error(error));
  //   }

    if (this.panid ==this.backendpanid) {
      if (this.password == this.backendpassword) {
        this.router.navigate(['ngohome']); 
        alert("Logged in")
      } else {
        alert("Wrong Password");
      }
    } else {
      alert("Wrong PAN ID");
    }
      
    

}
}
