import { Component, OnInit } from '@angular/core';
import { UnivercityService } from '../univercity.service';

@Component({
  selector: 'app-deletetable',
  templateUrl: './deletetable.component.html',
  styleUrls: ['./deletetable.component.css']
})
export class DeletetableComponent implements OnInit {
  tables:any[]=[];

  constructor(private service:UnivercityService) { }

  ngOnInit() {
    this.service.showtables().subscribe((data:any)=>this.tables=data)
  }

deleteCollege(){
  this.service.deleteCollegeTable().subscribe();
}
deleteCourse(){
  this.service.deleteCourseTable().subscribe();
}
deleteCanteen(){
  this.service.deleteCanteenTable().subscribe();
}
deletePlacement(){
  this.service.deleteCompanyData().subscribe();
}
}
