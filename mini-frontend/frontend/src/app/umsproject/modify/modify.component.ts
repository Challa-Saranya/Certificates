import { Component, OnInit } from '@angular/core';
import{Router,RouterLink} from '@angular/router'
import { UnivercityService } from '../univercity.service';
@Component({
  selector: 'app-modify',
  templateUrl: './modify.component.html',
  styleUrls: ['./modify.component.css']
})
export class ModifyComponent implements OnInit {
  router: any;
a:boolean=false;
b:boolean=true;
rowdata:any[]=[];
  collegedata:any[]=[];
  coursesdata:any[]=[];
  
  model:any={}; 
  placementData:any[]=[];
  canteenData:any[]=[];
  tables:any[]=[];
  selectedtable: string = '';

  constructor(private viewservice:UnivercityService) { }

  ngOnInit() {
    this.viewservice.getCollegeDetails().subscribe((data:any)=>this.collegedata=data);
    this.viewservice.getCourseDetails().subscribe((data:any)=>this.coursesdata=data);
    this.viewservice.getCanteenDetails().subscribe((data:any)=>this.canteenData=data);
    this.viewservice.getPlacementDetails().subscribe((data:any)=>this.placementData=data);
    this.viewservice.showtables().subscribe((data:any)=>this.tables=data);
  }

  onselectnext(){
   
this.a=true;
this.b=false;
  }
  

onselect(c){
this.viewservice.searchcollege(c).subscribe((data:any)=>this.rowdata=data)
}

update(model:any){
if(this.selectedtable.match("college")){
  this.viewservice.updatecollege(this.model).subscribe();
}
else if(this.selectedtable.match("courses")){
  this.viewservice.updatecourse(this.model).subscribe();
}
else if(this.selectedtable.match("canteen")){
  this.viewservice.updateCanteen(this.model).subscribe()
}
else{
  this.viewservice.updatePlacement(this.model).subscribe()
}
}

selectedcourse(course){
  this.viewservice.searchCourse(course).subscribe((data:any)=>this.rowdata=data);
}
selectedCanteen(canteen){
  this.viewservice.searchCanteen(canteen).subscribe((data:any)=>this.rowdata=data)
}
selectedPlacement(placement){
  this.viewservice.searchPlacement(placement).subscribe((data:any)=>this.rowdata=data)
}
}
