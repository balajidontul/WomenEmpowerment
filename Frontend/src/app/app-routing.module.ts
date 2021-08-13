import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminApprovedNgoComponent } from './admin/admin-approved-ngo/admin-approved-ngo.component';
import { AdminDashboardComponent } from './admin/admin-dashboard/admin-dashboard.component';
import { AdminPendingNgoComponent } from './admin/admin-pending-ngo/admin-pending-ngo.component';
import { HomeComponent } from './home/home.component';
import { AddcourseComponent } from './ngo/addcourse/addcourse.component';
import { CriteriaComponent } from './ngo/criteria/criteria.component';
import { FaqngoComponent } from './ngo/faqngo/faqngo.component';
import { FundingnormsComponent } from './ngo/fundingnorms/fundingnorms.component';
import { NGOComponent } from './ngo/ngo.component';

import { OrganisationComponent } from './ngo/organisation/organisation.component';
import { RegisterngoComponent } from './ngo/registerngo/registerngo.component';
import { StatusngoComponent } from './ngo/statusngo/statusngo.component';
import { RegisterComponent } from './register/register.component';
import { AboutusstepComponent } from './step/aboutusstep/aboutusstep.component';
import { DashboardstepComponent } from './step/dashboardstep/dashboardstep.component';
import { FaqstepComponent } from './step/faqstep/faqstep.component';
import { GuidelinestepComponent } from './step/guidelinestep/guidelinestep.component';
import { NgostepComponent } from './step/ngostep/ngostep.component';
import { RegistrationstepComponent } from './step/registrationstep/registrationstep.component';
import { StatusstepComponent } from './step/statusstep/statusstep.component';
import { StepComponent } from './step/step.component';
import { TrainingsectorsstepComponent } from './step/trainingsectorsstep/trainingsectorsstep.component';

const routes: Routes = [
  {path:'steppath', component:StepComponent, children: [
    {path: 'stepaboutus', component: AboutusstepComponent, outlet: 'stepsub'},
    {path: 'stepfaq', component: FaqstepComponent, outlet: 'stepsub'},
    {path: 'stepguideline', component: GuidelinestepComponent, outlet: 'stepsub'},
    {path: 'stepngo', component: NgostepComponent, outlet: 'stepsub'},
    {path: 'stepregister', component: RegistrationstepComponent, outlet: 'stepsub'},
    {path: 'stepstatus', component: StatusstepComponent, outlet: 'stepsub'},
    {path: 'steptrainingsectors', component: TrainingsectorsstepComponent, outlet: 'stepsub'},
    {path: 'stepdashboard', component: DashboardstepComponent, outlet: 'stepsub'}
  ] },




  // NGO ROUTING DONT DELETE
  {path:'', component:HomeComponent },
  { path: 'ngoregister', component: RegisterngoComponent},
{ path: 'ngopath', component: NGOComponent, children: [
    { path: 'ngoorganisation', component: OrganisationComponent, outlet: 'ngosub' },
    { path: 'ngocriteria', component: CriteriaComponent, outlet: 'ngosub' },
    { path: 'ngofunding', component: FundingnormsComponent, outlet: 'ngosub' },
    { path: 'ngoregister', component: RegisterngoComponent, outlet: 'ngosub' },
    { path: 'ngostatus', component: StatusngoComponent, outlet: 'ngosub' },
    { path: 'ngofaq', component: FaqngoComponent, outlet: 'ngosub' },
    { path: 'ngoaddcourse', component: AddcourseComponent, outlet: 'ngosub' }  
  ] },
//NGO ROUTING DONT



  {path:'adminpath', component:AdminDashboardComponent},
  {path: 'approved-ngo', component:AdminApprovedNgoComponent},
  {path: 'pending-ngo', component:AdminPendingNgoComponent},



  {path: 'user-register', component:RegisterComponent}

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
