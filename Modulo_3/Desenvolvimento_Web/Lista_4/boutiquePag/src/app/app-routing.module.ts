import { NgModule } from '@angular/core';
import { RouterModule, RouterOutlet, Routes } from '@angular/router';
import { HomeComponent } from './components/views/home/home.component';
import { ProductsComponent } from './components/views/products/products.component';

const routes: Routes = [
  {path:"",component:HomeComponent },
  {path:"/produtos", component:ProductsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
