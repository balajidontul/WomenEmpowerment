import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ngo } from '../ngo';
import { NgoService } from '../ngo.service';

@Component({
  selector: 'app-organisation',
  templateUrl: './organisation.component.html',
  styleUrls: ['./organisation.component.css']
})
export class OrganisationComponent implements OnInit {

  Organisations:Ngo[];

  constructor(private ngoService:NgoService, private router:Router) { }

  ngOnInit(): void {
    this.getall();
  }

  
  private getall() {
    this.ngoService.getallngo().subscribe(data => {
      console.log(data);
      
      this.Organisations = data;
    })
  }

  
  }



