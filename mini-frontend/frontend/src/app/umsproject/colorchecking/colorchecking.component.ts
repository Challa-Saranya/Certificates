import { Component, OnInit } from '@angular/core';
import { UnivercityService } from '../univercity.service';

@Component({
  selector: 'app-colorchecking',
  templateUrl: './colorchecking.component.html',
  styleUrls: ['./colorchecking.component.css']
})
export class ColorcheckingComponent implements OnInit {
tables:any[]=[];
  constructor(private service:UnivercityService) { }

  ngOnInit() {
    this.service.showfields().subscribe((data:any)=>console.log(data));
  }

}
