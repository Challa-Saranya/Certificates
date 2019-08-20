import { Component, OnInit } from '@angular/core';
import { UnivercityService } from '../univercity.service';

@Component({
  selector: 'app-deletesingle',
  templateUrl: './deletesingle.component.html',
  styleUrls: ['./deletesingle.component.css']
})
export class DeletesingleComponent implements OnInit {
  collegedata:any[]=[];
  coursesdata:any[]=[];
  canteenData:any[]=[];
  placementData:any[]=[];
  selectedtable: string = '';
  tables:any[]=[];

  constructor(private uservice:UnivercityService) { }

  ngOnInit() {
    this.uservice.getCollegeDetails().subscribe((data:any)=>this.collegedata=data);
    this.uservice.getCourseDetails().subscribe((data:any)=>this.coursesdata=data);
    this.uservice.getCanteenDetails().subscribe((data:any)=>this.canteenData=data);
    this.uservice.getPlacementDetails().subscribe((data:any)=>this.placementData=data);
    this.uservice.showtables().subscribe((data:any)=>this.tables=data);
  }
/* onDelete(c){
  
  var d=this. collegedata.indexOf(c);
  this.collegedata.splice(d,1);
this.uservice.deletecollege(c).subscribe();
} */
onDelete(c:any){
  if(this.selectedtable.match("college")){
    var d=this. collegedata.indexOf(c);
    this.collegedata.splice(d,1);
  this.uservice.deletecollege(c).subscribe();
  }
  else if(this.selectedtable.match("courses")){
    
      var d=this.coursesdata .indexOf(c);
      this.coursesdata.splice(d,1);
    this.uservice.deleteCanteen(c).subscribe();
  }
  else if(this.selectedtable.match("canteen")){
    var d=this.canteenData .indexOf(c);
    this.canteenData.splice(d,1);
  this.uservice.deleteCanteen(c).subscribe();
  }
  else{
    var d=this.canteenData .indexOf(c);
    this.placementData.splice(d,1);
  this.uservice.deletePlacement(c).subscribe();  
  }

}

}
