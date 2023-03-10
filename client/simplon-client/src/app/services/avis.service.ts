import { HttpClient } from "@angular/common/http"
import { Injectable } from "@angular/core"
import { Observable } from "rxjs"
import { Avis } from "../models/Avis"


@Injectable({
    providedIn: "root"
})

export class AvisService {

    constructor(private http: HttpClient){}

    APIurl :string = "http://localhost:8080"
    

    getAllAvis():Observable<Avis[]>{
       return this.http.get<Avis[]>(`${this.APIurl}/avis`)
    }

    getAvisById(id: number):Observable<Avis>{
        return this.http.get<Avis>(`${this.APIurl}/avis/${id}`)
    }

    newAvis(avis: Avis):Observable<Avis>{
        return this.http.post<Avis>(`${this.APIurl}/avis/new`, avis)
    }

    deleteAvisById(id: number):Observable<Avis>{
        return this.http.delete<Avis>(`${this.APIurl}/avis/${id}`)
    }
}