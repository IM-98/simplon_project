import { HttpClient } from "@angular/common/http"
import { Injectable } from "@angular/core"
import { Observable } from "rxjs"
import { Carte } from "../models/Carte"



@Injectable({
    providedIn: "root"
})

export class CarteService {

    constructor(private http: HttpClient){}

    APIurl :string = "http://localhost:8080"
    

    getAllAvis():Observable<Carte>{
       return this.http.get<Carte>(`${this.APIurl}/avis`)
    }

    getAvisById(id: number):Observable<Carte>{
        return this.http.get<Carte>(`${this.APIurl}/avis/${id}`)
    }

    newAvis(resa: Carte):Observable<Carte>{
        return this.http.post<Carte>(`${this.APIurl}/avis/new`, resa)
    }

    deleteAvisById(id: number):Observable<Carte>{
        return this.http.delete<Carte>(`${this.APIurl}/avis/${id}`)
    }
}