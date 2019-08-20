import { Component, OnInit } from '@angular/core';
import { UnivercityService } from '../univercity.service';

@Component({
  selector: 'app-viewpage',
  templateUrl: './viewpage.component.html',
  styleUrls: ['./viewpage.component.css']
})
export class ViewpageComponent implements OnInit {


  collegedata: any[] = [];
  canteenData: any[] = []
  placementData: any[] = []
  courseData: any[] = [];
  tables:any[]=[];
  constructor(private viewservice: UnivercityService) { }

  ngOnInit() {
    this.viewservice.getCollegeDetails().subscribe((data: any) => this.collegedata = data);
    this.viewservice.getCourseDetails().subscribe((data: any) => this.courseData = data);
    this.viewservice.getCanteenDetails().subscribe((data: any) => this.canteenData = data);
    this.viewservice.getPlacementDetails().subscribe((data: any) => this.placementData = data);
    this.viewservice.showtables().subscribe((data:any)=>this.tables=data);
  }


}
