import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  ngos:Ngo[];
  noOfApprovedNgo:number;
  noOfPendingNgo:number;
  constructor(private ngoService:NgoService, private router:Router) { }

  ngOnInit(): void {
    this.getApprovedNgo();
    this.getPendingNgo();
  }

  private getApprovedNgo() {
    this.ngoService.getApprovedNgoList().subscribe(data => {
      this.ngos = data;
      this.noOfApprovedNgo = this.ngos.length;
  

    })
  }

  
  private getPendingNgo() {
    this.ngoService.getPendingNgoList().subscribe(data => {
      this.ngos = data;
      this.noOfPendingNgo = this.ngos.length;
    })
  }

}
