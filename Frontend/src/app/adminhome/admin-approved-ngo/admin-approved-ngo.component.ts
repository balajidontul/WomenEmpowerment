import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ngo } from 'src/app/ngo/ngo';
import { NgoService } from 'src/app/ngo/ngo.service';

@Component({
  selector: 'app-admin-approved-ngo',
  templateUrl: './admin-approved-ngo.component.html',
  styleUrls: ['./admin-approved-ngo.component.css']
})
export class AdminApprovedNgoComponent implements OnInit {

  ngos:Ngo[];
  constructor(private ngoService:NgoService, private router:Router) { }

  ngOnInit(): void {
    this.getApprovedNgo();
  }

  
  private getApprovedNgo() {
    this.ngoService.getApprovedNgoList().subscribe(data => {
      this.ngos = data;
    })
  }

   deleteNgo(organisationId:number) {
    this.ngoService.deleteNgo(organisationId).subscribe(data => {
      data = organisationId;
      window.location.reload();
    })
  }


}
