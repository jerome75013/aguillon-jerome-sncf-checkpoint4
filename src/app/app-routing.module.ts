import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { from } from 'rxjs';
import { ActivityComponent } from './activity/activity.component';
import { ContactFormComponent } from './contact-form/contact-form.component';
import { HomeComponent } from './home/home.component';
import { IdentifyAdminComponent } from './identify-admin/identify-admin.component';


const routes: Routes = [
  {path:'', component: HomeComponent
  },
  {path: 'activity', component: ActivityComponent
  },
  {path: 'Contact-Form', component: ContactFormComponent
  },  
  {path: 'identify-admin', component: IdentifyAdminComponent
  },
  ]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
