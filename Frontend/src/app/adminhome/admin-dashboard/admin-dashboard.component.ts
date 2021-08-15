import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ngo } from 'src/app/ngo/ngo';
import { NgoService } from 'src/app/ngo/ngo.service';
import { MultiDataSet, Label } from 'ng2-charts';
import { ChartOptions, ChartType, ChartDataSets } from 'chart.js';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  ngos:Ngo[];
  noOfApprovedNgo:number;
  noOfPendingNgo:number;

  // Doughnut chart.
  doughnutChartLabels: Label[];
  doughnutChartData: MultiDataSet = [[0,0]] ;
  doughnutChartType: ChartType;
  chartReady:boolean;

  // Barchart.
  barChartOptions: ChartOptions = {
    responsive: true,
    maintainAspectRatio: true,
    scales: {
      yAxes: [{
          display: true,
          stacked: true,
          ticks: {
              min: 0, // minimum value
              max: 10 // maximum value
          }
      }]
  }
  };
  barChartLabels: Label[];
  barChartType: ChartType = 'bar';
  barChartLegend = true;
  
  barChartPlugins = [];
  barChartData: ChartDataSets[];
  noOfNgo: number[];

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

  public mapToProp(data, prop) {
    return data
      .reduce((res, item) => Object
        .assign(res, {
          [item[prop]]: 1 + (res[item[prop]] || 0)
        }), Object.create(null))
    ;
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

    
    let locations = this.mapToProp(this.ngos, 'location');
    this.barChartLabels = Object.keys(locations);
    this.noOfNgo = Object.values(locations);
    console.log("Labels", this.barChartLabels);
    console.log("Count", this.noOfNgo);
    await new Promise(f => setTimeout(f, 1000));
    this.barChartData = [{data:[1,2], label: 'NGOs across locations'}];

    this.chartReady=true;
  }
 }
  
