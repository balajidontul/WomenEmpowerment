import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { HomeComponent } from './home/home.component';
import { CriteriaComponent } from './ngo/criteria/criteria.component';
import { NGOComponent } from './ngo/ngo.component';
import { StepComponent } from './step/step.component';

const routes: Routes = [
  {path:'steppath', component:StepComponent },
  {path:'', component:HomeComponent },
  {path:'ngopath', component:NGOComponent },
  {path:'adminpath', component:AdminComponent },
  {path : 'criteriapath', component : CriteriaComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
