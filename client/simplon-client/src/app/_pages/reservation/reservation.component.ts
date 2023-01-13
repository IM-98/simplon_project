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

  constructor(private formBuilder: FormBuilder, private router: Router) {}

  ngOnInit(): void {
    this.rezaForm = this.formBuilder.group ({
        nom: ['', [
          Validators.required,
        ]],
        email: ['', [
          Validators.required,
          Validators.email
        ]],
        nbAdults: ['', [
          Validators.required,
          Validators.minLength(1)
        ]],
        dateReservation: ['', [
          Validators.required,

        ]],
        cartes: ['', [
          Validators.required,
        ]]

      });
}
      get nom() {
        return this.rezaForm.get('nom') as FormControl;
      }
      get email() {
        return this.rezaForm.get('email') as FormControl;
      }
      get nbAdults() {
        return this.rezaForm.get('nbAdults') as FormControl;
      }
      get dateReservation() {
        return this.rezaForm.get('dateReservation') as FormControl;
      }
      get cartes() {
        return this.rezaForm.get('cartes') as FormControl;
      }

  onSubmit() {
    if (this.rezaForm!.valid) {

      alert('Formulaire valide !');
    } else {
      alert('Formulaire invalide !');
    }
  }
}

