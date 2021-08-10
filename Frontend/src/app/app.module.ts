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
import { AboutusHomeComponent } from './home/subcomponents/aboutus-home/aboutus-home.component';
import { AboutushomeComponent } from './home/subcomponents/aboutushome/aboutushome.component';
import { AboutusstepComponent } from './aboutusstep/aboutusstep.component';
import { GuidelinesstepComponent } from './guidelinesstep/guidelinesstep.component';
import { TrainingsectorsstepComponent } from './trainingsectorsstep/trainingsectorsstep.component';
import { NgostepComponent } from './ngostep/ngostep.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    AdminComponent,
    StepComponent,
    NGOComponent,
    RegisterComponent,
    AboutusHomeComponent,
    AboutushomeComponent,
    AboutusstepComponent,
    GuidelinesstepComponent,
    TrainingsectorsstepComponent,
    NgostepComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
