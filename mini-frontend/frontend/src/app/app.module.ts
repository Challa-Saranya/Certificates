import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './umsproject/login.component';
import { MenuComponent } from './umsproject/menu/menu.component';
import { LoadsingleComponent } from './umsproject/loadsingle/loadsingle.component';

import { LoadbulkComponent } from './umsproject/loadbulk/loadbulk.component';
import { ViewpageComponent } from './umsproject/viewpage/viewpage.component';
import { ModifyComponent } from './umsproject/modify/modify.component';

import { SignupComponent } from './umsproject/signup/signup.component';
import { HttpClientModule } from '@angular/common/http';
import { LogoutComponent } from './umsproject/logout/logout.component';
import { DeletesingleComponent } from './umsproject/deletesingle/deletesingle.component';
import { ColorcheckingComponent } from './umsproject/colorchecking/colorchecking.component';
import { DeletebulkComponent } from './umsproject/deletebulk/deletebulk.component';
import { DeletetableComponent } from './umsproject/deletetable/deletetable.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MenuComponent,
    LoadsingleComponent,
 
    LoadbulkComponent,
    ViewpageComponent,
    ModifyComponent,
  
    SignupComponent,
    LogoutComponent,
    DeletesingleComponent,
    ColorcheckingComponent,
    DeletebulkComponent,
    DeletetableComponent,
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
