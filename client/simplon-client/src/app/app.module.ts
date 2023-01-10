import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ButtonComponent } from './_components/button/button.component';
import { InputComponent } from './_components/input/input.component';
import { ContactComponent } from './_pages/contact/contact.component';
import { ReservationComponent } from './_pages/reservation/reservation.component';
import { HeaderComponent } from './header/header.component';
import { MenuComponent } from './_pages/menu/menu.component';
import { AvisComponent } from './_pages/avis/avis.component';
import { ReactiveFormsModule } from '@angular/forms';
import { LocalisationComponent } from './_pages/localisation/localisation.component';
import { HomeComponent } from './_pages/home/home.component';
import { CartesComponent } from './_pages/cartes/cartes.component';


@NgModule({
  declarations: [
    AppComponent,
    ButtonComponent,
    InputComponent,
    ContactComponent,
    ReservationComponent,
    HeaderComponent,
    MenuComponent,
    AvisComponent,
    LocalisationComponent,
    HomeComponent,
    CartesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
