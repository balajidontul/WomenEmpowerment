import { Component, OnInit } from '@angular/core';
import { NgoService } from 'src/app/ngo/ngo.service';
import { Router } from '@angular/router';
import { Ngo } from 'src/app/ngo/ngo';

@Component({
  selector: 'app-admin-pending-ngo',
  templateUrl: './admin-pending-ngo.component.html',
  styleUrls: ['./admin-pending-ngo.component.css']
})
export class AdminPendingNgoComponent implements OnInit {

  ngos:Ngo[];
  constructor(private ngoService:NgoService, private router:Router) { }

  ngOnInit(): void {
    this.getPendingNgo();
  }

  private getPendingNgo() {
    this.ngoService.getPendingNgoList().subscribe(data => {
      this.ngos = data;
    })
  }

  approveNgo(organisationId:number) {
    this.ngoService.approvePendingNgo(organisationId).subscribe(data => {
      data = organisationId;
      window.location.reload();
    });
  
    }
  }
