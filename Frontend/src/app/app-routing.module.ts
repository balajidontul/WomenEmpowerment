import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminApprovedNgoComponent } from './admin/admin-approved-ngo/admin-approved-ngo.component';
import { AdminDashboardComponent } from './admin/admin-dashboard/admin-dashboard.component';
import { AdminPendingNgoComponent } from './admin/admin-pending-ngo/admin-pending-ngo.component';
import { HomeComponent } from './home/home.component';
import { CriteriaComponent } from './ngo/criteria/criteria.component';
import { FaqngoComponent } from './ngo/faqngo/faqngo.component';
import { FundingnormsComponent } from './ngo/fundingnorms/fundingnorms.component';
import { NGOComponent } from './ngo/ngo.component';
import { OrganisationComponent } from './ngo/organisation/organisation.component';
import { RegisterngoComponent } from './ngo/registerngo/registerngo.component';
import { StatusngoComponent } from './ngo/statusngo/statusngo.component';
import { RegisterComponent } from './register/register.component';
import { StepComponent } from './step/step.component';

const routes: Routes = [
  {path:'steppath', component:StepComponent },
  {path:'', component:HomeComponent },


{ path: 'ngopath', component: NGOComponent, children: [
    { path: 'ngoorganisation', component: OrganisationComponent, outlet: 'ngosub' },
    { path: 'ngocriteria', component: CriteriaComponent, outlet: 'ngosub' },
    { path: 'ngofunding', component: FundingnormsComponent, outlet: 'ngosub' },
    { path: 'ngoregister', component: RegisterngoComponent, outlet: 'ngosub' },
    { path: 'ngostatus', component: StatusngoComponent, outlet: 'ngosub' },
    { path: 'ngofaq', component: FaqngoComponent, outlet: 'ngosub' }
  ] },

  {path:'adminpath', component:AdminDashboardComponent},
  {path: 'approved-ngo', component:AdminApprovedNgoComponent},
  {path: 'pending-ngo', component:AdminPendingNgoComponent},

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
