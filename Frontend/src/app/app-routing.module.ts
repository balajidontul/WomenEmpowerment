import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminApprovedNgoComponent } from './admin/admin-approved-ngo/admin-approved-ngo.component';
import { AdminDashboardComponent } from './admin/admin-dashboard/admin-dashboard.component';
import { AdminPendingNgoComponent } from './admin/admin-pending-ngo/admin-pending-ngo.component';
import { HomeComponent } from './home/home.component';
import { CriteriaComponent } from './ngo/criteria/criteria.component';
import { FundingnormsComponent } from './ngo/fundingnorms/fundingnorms.component';
import { NGOComponent } from './ngo/ngo.component';
import { OrganisationComponent } from './ngo/organisation/organisation.component';
import { RegisterComponent } from './register/register.component';
import { StepComponent } from './step/step.component';

const routes: Routes = [
  {path:'steppath', component:StepComponent },
  {path:'', component:HomeComponent },


{ path: 'ngopath', component: NGOComponent, children: [
    { path: 'ngoorganisation', component: OrganisationComponent, outlet: 'ngosub' }
  ] },

  {path:'adminpath', component:AdminDashboardComponent},
  {path: 'approved-ngo', component:AdminApprovedNgoComponent},
  {path: 'pending-ngo', component:AdminPendingNgoComponent},
  {path : 'criteriapath', component : CriteriaComponent ,outlet: 'aux'},
  {path : 'fundingnorms', component : FundingnormsComponent},
  {path : 'organisation', component : OrganisationComponent},
  {path : 'registerngo', component : RegisterComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
