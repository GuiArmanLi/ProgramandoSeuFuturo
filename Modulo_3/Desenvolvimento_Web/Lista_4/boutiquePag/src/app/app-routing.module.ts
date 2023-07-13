import { NgModule } from '@angular/core';
import { RouterModule, RouterOutlet, Routes } from '@angular/router';
import { FooterComponent } from './components/shared/footer/footer.component';
import { HomeComponent } from './components/views/home/home.component';

const routes: Routes = [
  {path:"",component:HomeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
