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

  constructor(private formBuilder: FormBuilder, private router: Router, private reservationService: ReservationService) {}

  ngOnInit(): void {
    this.rezaForm = this.formBuilder.group ({
        prenom: ['', [
          Validators.required,
        ]],
        nom: ['', [
          Validators.required,
        ]],
        email: ['', [
          Validators.required,
          Validators.email
        ]],
        nbrPersonne: ['', [
          Validators.required,
        ]],
        horaire: ['', [
          Validators.required,
        ]]

      });
}
      get nom() {
        return this.rezaForm.get('nom') as FormControl;
      }
      get prenom() {
        return this.rezaForm.get('prenom') as FormControl;
      }
      get email() {
        return this.rezaForm.get('email') as FormControl;
      }
      get nbrPersonne() {
        return this.rezaForm.get('nbrPersonne') as FormControl;
      }
      get horaire() {
        return this.rezaForm.get('horaire') as FormControl;
      }
     

  onSubmit() {
    if (this.rezaForm!.valid) {
      console.log(this.rezaForm.value)
      this.reservationService.newReservation(this.rezaForm.value).subscribe(res  => res)
      
    } else {
      alert('Formulaire invalide !');
    }
  }
}

