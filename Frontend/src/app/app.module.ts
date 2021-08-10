import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { StepComponent } from './step/step.component';
import { NGOComponent } from './ngo/ngo.component';
import { RegisterComponent } from './register/register.component';

import { FaqComponent } from './step/faq/faq.component';
import { StatusComponent } from './step/status/status.component';

import { CriteriaComponent } from './ngo/criteria/criteria.component';
import { OrganisationComponent } from './ngo/organisation/organisation.component';
import { FundingnormsComponent } from './ngo/fundingnorms/fundingnorms.component';
import { RegisterngoComponent } from './ngo/registerngo/registerngo.component';
import { StatusngoComponent } from './ngo/statusngo/statusngo.component';
import { FaqngoComponent } from './ngo/faqngo/faqngo.component';
import { FormsModule } from '@angular/forms';
import { AboutusComponent } from './step/aboutus/aboutus.component';
import { GuidelinesComponent } from './step/guidelines/guidelines.component';
import { NgoComponent } from './step/ngo/ngo.component';
import { TrainingsectorsComponent } from './step/trainingsectors/trainingsectors.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    AdminComponent,
    StepComponent,
    NGOComponent,
    RegisterComponent,

    FaqComponent,
    StatusComponent,


    CriteriaComponent,
    OrganisationComponent,
    FundingnormsComponent,
    RegisterngoComponent,
    StatusngoComponent,
    FaqngoComponent,
    AboutusComponent,
    GuidelinesComponent,
    NgoComponent,
    TrainingsectorsComponent


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }