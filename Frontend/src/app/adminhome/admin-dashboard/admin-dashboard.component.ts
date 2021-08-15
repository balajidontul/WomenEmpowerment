import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ngo } from 'src/app/ngo/ngo';
import { NgoService } from 'src/app/ngo/ngo.service';
import { ChartType } from 'chart.js';
import { MultiDataSet, Label } from 'ng2-charts';


@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  ngos:Ngo[];
  noOfApprovedNgo:number;
  noOfPendingNgo:number;
  doughnutChartLabels: Label[];
  doughnutChartData: MultiDataSet = [[0,0]] ;
  doughnutChartType: ChartType;
  chartReady:boolean;
  constructor(private ngoService:NgoService, private router:Router) {
    
   }

  ngOnInit(): void {
    this.getApprovedNgo();
    this.getPendingNgo();
    this.showChart();
  }

  public getApprovedNgo() {
    this.ngoService.getApprovedNgoList().subscribe(data => {
      this.ngos = data;
      this.noOfApprovedNgo = this.ngos.length;
    })
  }

  
  public getPendingNgo() {
    this.ngoService.getPendingNgoList().subscribe(data => {
      this.ngos = data;
      this.noOfPendingNgo = this.ngos.length;
    
    })
  }

  public async showChart() {
    this.getPendingNgo();
    this.getApprovedNgo();
    await new Promise(f => setTimeout(f, 1000));
    this.doughnutChartLabels = ['Approved NGO', 'Pending NGO'];
    this.doughnutChartData = [[this.noOfApprovedNgo, this.noOfPendingNgo]];
    this.doughnutChartType = 'doughnut';
    this.chartReady=true;
  }
 }
  