import { Component, OnInit } from '@angular/core';
import { Ngo } from 'src/app/ngo/ngo';
import { Router } from '@angular/router';
import { NgoService } from 'src/app/ngo/ngo.service';


@Component({
  selector: 'app-trainingsectorsstep',
  templateUrl: './trainingsectorsstep.component.html',
  styleUrls: ['./trainingsectorsstep.component.css']
})
export class TrainingsectorsstepComponent implements OnInit {

  OrganisationNames: Ngo[];
  constructor(private ngoServices: NgoService, private router: Router) { }

  ngOnInit(): void {
    this.getAllNgos();
  }

  private getAllNgos() {
    this.ngoServices.getallngo().subscribe(data => {
      this.OrganisationNames = data;
    })
  }

}
