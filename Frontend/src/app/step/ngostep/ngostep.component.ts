import { Component, OnInit } from '@angular/core';
import { StepService } from '../step.service';
import { Router } from '@angular/router';
import {NgoDetails} from '../ngodetails';
import { NgoService } from 'src/app/ngo/ngo.service';
import { Ngo } from 'src/app/ngo/ngo';


@Component({
  selector: 'app-ngostep',
  templateUrl: './ngostep.component.html',
  styleUrls: ['./ngostep.component.css']
})
export class NgostepComponent implements OnInit {

  NgoNames: NgoDetails[];
  ngos:Ngo[];
  constructor(private stepService : StepService, private router : Router,
    private ngoService:NgoService) { }

  

  ngOnInit(): void {
    this.getAllNgos();
  }

  getAllNgos() {
     this.ngoService.getApprovedNgoList().subscribe(data => {
      console.log(data);
      this.NgoNames = data;
    })
  }

}
