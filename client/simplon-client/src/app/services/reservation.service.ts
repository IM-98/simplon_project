import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Client } from "../models/Client";
import { Reservation } from "../models/Reservation";



@Injectable({
    providedIn: "root"
})

export class ReservationService {

    constructor(private http: HttpClient){}

    APIurl :string = "http://localhost:8080"
    

    getAllReservations():Observable<Reservation[]>{
       return this.http.get<Reservation[]>(`${this.APIurl}/reservations`)
    }

    getReservationById(id: number):Observable<Reservation>{
        return this.http.get<Reservation>(`${this.APIurl}/reservations/${id}`)
    }

    newReservation(resa: Reservation):Observable<Reservation>{
        return this.http.post<Reservation>(`${this.APIurl}/reservations/new`, resa)
    }

    deleteReservationById(id: number):Observable<Reservation>{
        return this.http.delete<Reservation>(`${this.APIurl}/reservations/${id}`)
    }

    getReservationByClient(email: string):Observable<Client>{
        return this.http.get<Client>(`${this.APIurl}/clients/${email}`)
    }
}