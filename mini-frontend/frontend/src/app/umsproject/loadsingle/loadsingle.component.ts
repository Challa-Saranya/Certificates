import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { UnivercityService } from '../univercity.service';
@Component({
  selector: 'app-loadsingle',
  templateUrl: './loadsingle.component.html',
  styleUrls: ['./loadsingle.component.css']
})
export class LoadsingleComponent implements OnInit {
 
   Courses:string;
  colleges:string;
collegedata:any[]=[];
  adddata:string='';
  model:any[]=[];
  tables:any[]=[];

 /*  selectedtable:string;
 table:string;
 columnsdata:any[]=[]; */

 
 
  constructor(private umservice:UnivercityService,private route:Router) { }

  ngOnInit() {
  this.umservice.showtables().subscribe((data:any)=>this.tables=data);
  
  }

    
    addcollege():any{
      console.log(this.model);
      this.umservice.addcollegedetails(this.model).subscribe();
alert("data is saved");
    }

    addcourse():any{
      console.log(this.model);
      this.umservice.addCourse(this.model).subscribe();
      alert("data is saved");
    }
    addItem():any{
      this.umservice.addCanteendetails(this.model).subscribe();
      alert("data is saved");
    }
    addPlacementData():any{
      this.umservice.addPlacementDetails(this.model).subscribe();
      alert("data is saved");
    }
 /*    saveData(model){
      for(this.i=0;this.i<this.tables.length;this.i++){
if(this.table.match(this.i))
this.umservice.addCanteendetails(this.model).subscribe();
      }
    } */
}

