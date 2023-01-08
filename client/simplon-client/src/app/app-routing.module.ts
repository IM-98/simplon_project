import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LocalisationComponent } from './_pages/localisation/localisation.component';
import { AvisComponent } from './_pages/avis/avis.component';
import { ContactComponent } from './_pages/contact/contact.component';
import { MenuComponent } from './_pages/menu/menu.component';
import { ReservationComponent } from './_pages/reservation/reservation.component';

const routes: Routes = [

  // Routes
{
  path: 'avis',
  component: AvisComponent,
},
{
  path: 'contact',
  component: ContactComponent,
},
{
  path: 'cartes & menu',
  component: MenuComponent,
},
{
  path: 'localisation',
  component: LocalisationComponent,
},
{
  path: 'reservation',
  component: ReservationComponent,
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
