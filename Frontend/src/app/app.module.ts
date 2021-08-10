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
import { RegistrationstepComponent } from './registrationstep/registrationstep.component';
import { StatusstepComponent } from './statusstep/statusstep.component';
import { FaqstepComponent } from './faqstep/faqstep.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    AdminComponent,
    StepComponent,
    NGOComponent,
    RegisterComponent,
    RegistrationstepComponent,
    StatusstepComponent,
    FaqstepComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
