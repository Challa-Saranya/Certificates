import { Component, OnInit } from '@angular/core';
import { UnivercityService } from '../univercity.service';
import { Router } from "@angular/router";


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  model:any={};
  result:boolean;


  constructor(private userService:UnivercityService,private router:Router) { }

  ngOnInit() {
   
  }
  addUser():any{
    console.log(this.model);
    this.userService.addUser(this.model).subscribe((data:boolean)=>this.result=data);
    console.log(this.result);
    if(!this.result){
      alert("Registration Successfull")
      this.router.navigate(['/loginpage']);
    }
    else{
      alert("User Already Exists");
    }
  }

}
