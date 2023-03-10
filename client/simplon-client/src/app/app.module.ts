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
import { HttpClientModule} from "@angular/common/http"
import { ReservationService } from './services/reservation.service';
import { FooterComponent } from './_pages/footer/footer.component';
import { CircleComponent } from './_pages/circle/circle.component';
import { ListeReservationComponent } from './_pages/listeReservation/liste-reservation/liste-reservation.component';

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
    CartesComponent,
    FooterComponent,
    CircleComponent,
    ListeReservationComponent,
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule

  ],
  providers: [

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
