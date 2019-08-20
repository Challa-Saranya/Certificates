import { Component, OnInit } from '@angular/core';
import { UnivercityService } from '../univercity.service';

@Component({
  selector: 'app-loadbulk',
  templateUrl: './loadbulk.component.html',
  styleUrls: ['./loadbulk.component.css']
})
export class LoadbulkComponent implements OnInit {
  selectedFiles: FileList;
  currentFileUpload: File;
  tables:any[];
  dataone:any[];
  selectedtable:string;
  
  constructor(private userService:UnivercityService) { }

  ngOnInit() {
    this.userService.showtables().subscribe((data:any)=>this.tables=data);
  }
  selectFile(event) {
    this.selectedFiles = event.target.files;
  }
  selected(event)
  {
    this.selectedtable=event.target.value;
  }
  upload() {
if(this.selectedtable.match("college")){
 
    this.currentFileUpload = this.selectedFiles.item(0);
    
    this.userService.saveProfile(this.currentFileUpload).subscribe(event => {
      
    });
 
    this.selectedFiles = undefined;

  }
  else if(this.selectedtable.match("courses")){
    this.currentFileUpload = this.selectedFiles.item(0);
    
    this.userService.saveCourseBulk(this.currentFileUpload).subscribe(event => {
      
    });
 
    this.selectedFiles = undefined;
    
  }
  }
  getdata(){
  
    this.userService.getCollegeDetails().subscribe((data:any)=>{this.dataone=data;
  /*   let files=this.dataone[name];
    console.log(this.dataone[name]);
    console.log(files); */
 /*  var reader = new FileReader();
  
    reader.readAsDataURL(files); 
     */

  });
}
}
