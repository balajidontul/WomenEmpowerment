import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
<<<<<<< HEAD
import { AdminComponent } from './admin/admin.component';
import { HomeComponent } from './home/home.component';
import { NGOComponent } from './ngo/ngo.component';
import { StepComponent } from './step/step.component';

const routes: Routes = [
  {path:'steppath', component:StepComponent },
  {path:'', component:HomeComponent },
  {path:'ngopath', component:NGOComponent },
  {path:'adminpath', component:AdminComponent }
=======
import { HomeComponent } from './home/home.component';
import { RegisterngoComponent } from './ngo/registerngo/registerngo.component';
import { StatusngoComponent } from './ngo/statusngo/statusngo.component';
import { FaqngoComponent } from './ngo/faqngo/faqngo.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'registerngo',component:RegisterngoComponent},
  {path:'statusngo',component:StatusngoComponent},
  {path:'faqngo',component:FaqngoComponent}
>>>>>>> siddarth
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
