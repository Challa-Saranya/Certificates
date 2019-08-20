import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { UnivercityService } from './univercity.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  model:any={};
 result:boolean

  constructor(private router:Router,private userService:UnivercityService) { }

  ngOnInit() {
  }
  onLogin(){
  
    console.log(this.model.email)
 this.userService.validateLogin(this.model.email,this.model.password).subscribe((data:boolean)=>{this.result=data
    
    
  if(this.result){
    alert("login success")
    this.router.navigate(['/menupage']);
  }
  else
  alert("Invalid username or password")
});
}
}
