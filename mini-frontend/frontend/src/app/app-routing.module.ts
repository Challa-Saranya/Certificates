import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MenuComponent } from './umsproject/menu/menu.component';
import { LoginComponent } from './umsproject/login.component';
import { LoadsingleComponent } from './umsproject/loadsingle/loadsingle.component';

import { LoadbulkComponent } from './umsproject/loadbulk/loadbulk.component';
import { ViewpageComponent } from './umsproject/viewpage/viewpage.component';
import { ModifyComponent } from './umsproject/modify/modify.component';

import { SignupComponent } from './umsproject/signup/signup.component';
import { LogoutComponent } from './umsproject/logout/logout.component';
import { DeletesingleComponent } from './umsproject/deletesingle/deletesingle.component';
import { ColorcheckingComponent } from './umsproject/colorchecking/colorchecking.component';
import { DeletebulkComponent } from './umsproject/deletebulk/deletebulk.component';
import { DeletetableComponent } from './umsproject/deletetable/deletetable.component';


const routes: Routes = [

  {path:'loginpage',component:LoginComponent},
  {path :'menupage',component:MenuComponent},
  {path :'loadsingle',component:LoadsingleComponent},
 
  {path:'loadbulk',component:LoadbulkComponent},
  {path:'viewpage',component:ViewpageComponent},
  {path:'modifypage',component:ModifyComponent},
 {path:'delpage',component:DeletesingleComponent},
  {path:'signuppage',component:SignupComponent},
  {path:'logoutpage',component:LogoutComponent},
  {path:'demo',component:ColorcheckingComponent},
  {path:'deletebulk',component:DeletebulkComponent},
  {path:'deletetable',component:DeletetableComponent},
   {path :'', redirectTo:'/loginpage', pathMatch:'full'}  
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
