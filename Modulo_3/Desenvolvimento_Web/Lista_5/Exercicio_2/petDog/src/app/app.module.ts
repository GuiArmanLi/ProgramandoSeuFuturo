import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/views/home/home.component';
import { AdicionarAnimalComponent } from './components/views/adicionar-animal/adicionar-animal.component';
import { ToolbarComponent } from './components/common/toolbar/toolbar.component';
import { ListaAnimaisComponent } from './components/common/lista-animais/lista-animais.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdicionarAnimalComponent,
    ToolbarComponent,
    ListaAnimaisComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
