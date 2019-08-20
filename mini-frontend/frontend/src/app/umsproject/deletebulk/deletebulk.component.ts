import { Component, OnInit } from '@angular/core';
import { UnivercityService } from '../univercity.service';
import { Router } from '../../../../node_modules/@angular/router';

@Component({
  selector: 'app-deletebulk',
  templateUrl: './deletebulk.component.html',
  styleUrls: ['./deletebulk.component.css']
})
export class DeletebulkComponent implements OnInit {
  collegedata:any[]=[];
  coursedata:any[]=[];
  canteenData:any[]=[];
  course:boolean=false;
  college:boolean=false; 
   Courses:string;
  colleges:string;
  selectedtable: string = '';
  adddata:string='';
  tables:any[]=[];
  placementData:any[]=[];
  
  selectedIds:any[]=[];
  checkbox:boolean;
  constructor(private service:UnivercityService,private router:Router) {
    this.checkbox=false;
   }

  ngOnInit() {
    this.service.getCollegeDetails().subscribe((data:any)=>this.collegedata=data);
    this.service.getCourseDetails().subscribe((data1:any)=>this.coursedata=data1);
    this.service.showtables().subscribe((data:any)=>this.tables=data);
    this.service.getCanteenDetails().subscribe((data:any)=>this.canteenData=data);
    
    this.service.getPlacementDetails().subscribe((data:any)=>this.placementData=data);
  }
  /* selectChangeHandler (event: any) {
    
    this.selectedtable = event.target.value;
  
    }  */

    
  selectId(sno,event:any){
    console.log(sno);
    this.selectedIds.push(sno);
 }
  onDelete1(){
   
  for(var i=0;i<this.selectedIds.length;i++){
   console.log(this.selectedIds);
    this.service.deletecollegeBulk(this.selectedIds[i]).subscribe();
   
  }
}
  deleteCourse(){
    for(var i=0;i<this.selectedIds.length;i++){
      console.log(this.selectedIds);
      this.service.deleteCourseBulk(this.selectedIds[i]).subscribe();
      
    }
}

onDelete(placement){
  for(var i=0;i<this.selectedIds.length;i++){
    console.log(this.selectedIds);
    this.service.deletePlacementBulk(this.selectedIds[i]).subscribe();
    
  }
}
onDelete2(canteen){
  for(var i=0;i<this.selectedIds.length;i++){
    console.log(this.selectedIds);
    this.service.deleteCanteenBulk(this.selectedIds[i]).subscribe();
    
  }
}

}