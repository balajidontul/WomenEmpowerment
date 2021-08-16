import { Component, OnInit } from '@angular/core';
import { Ngo } from '../ngo';
import { NgoService } from '../ngo.service';
import { Ngocourse } from '../ngocourse';

@Component({
  selector: 'app-statusngo',
  templateUrl: './statusngo.component.html',
  styleUrls: ['./statusngo.component.css']
})
export class StatusngoComponent implements OnInit {


  output:String='waiting for input';
  panid:String='';

  send( id:String){
    if (id=='') {
      alert('PAN ID cant be Null');
    } else {
      console.log(id);
      this.ngoserv.getStatusofNGO(id).subscribe(data=>{
    
      this.output = data;
      console.log(data);
  
  } ,error=> console.error(error));
    }
    


  

  }

  constructor(private ngoserv:NgoService) { }

  ngOnInit(): void {
  }

}
