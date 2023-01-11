import { Component, OnInit } from '@angular/core';
import { Reservation } from 'src/app/models/Reservation';
import { ReservationService } from 'src/app/services/reservation.service';


@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.scss']
})
export class ReservationComponent implements OnInit {
  constructor( private reservationService: ReservationService){}

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
  }
  

}
