import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Reservation } from 'src/app/models/Reservation';
import { ReservationService } from 'src/app/services/reservation.service';


@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.scss']
})
export class ReservationComponent implements OnInit {
  rezaForm!: FormGroup;

  constructor( private reservationService: ReservationService,
               private formBuilder: FormBuilder,
               private router: Router){}

  listeReservations!: Reservation[]
  OneReservation!: Reservation

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
    if (this.rezaForm!.valid) {

      alert('Formulaire valide !');
    } else {
      alert('Formulaire invalide !');
    }
  }
}
