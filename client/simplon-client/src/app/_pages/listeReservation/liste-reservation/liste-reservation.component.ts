import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Reservation } from 'src/app/models/Reservation';
import { ReservationService } from 'src/app/services/reservation.service';

@Component({
  selector: 'app-liste-reservation',
  templateUrl: './liste-reservation.component.html',
  styleUrls: ['./liste-reservation.component.scss']
})
export class ListeReservationComponent {
  rezaForm!: FormGroup;

  constructor( private reservationService: ReservationService,
               private formBuilder: FormBuilder,
               private router: Router){}

  listeReservations!: Reservation[]
  OneReservation!: Reservation
  reservationOfClient!: Reservation[]

  getReservationById(id: number){
    this.reservationService.getReservationById(id).subscribe(res => this.OneReservation = res)
  }

  getReservation(){
    this.reservationService.getAllReservations().subscribe(res => this.listeReservations = res)
  }

  ngOnInit(){
    this.getReservation()
      this.rezaForm = this.formBuilder.group ({
        email: ['', [
          Validators.required,
          Validators.email
        ]],
      });
}
      get email() {
        return this.rezaForm.get('email') as FormControl;
      }

  onSubmit() {

    // this.reservationService.getReservationByClient(this.rezaForm.value)
    if (this.rezaForm!.valid) {
      let emailValue = this.rezaForm.get("email")?.value
      this.reservationService.getReservationByClient(emailValue).subscribe(res => this.reservationOfClient = res.reservation )

    } else {
      alert('Formulaire invalide !');
    }
  }

}
