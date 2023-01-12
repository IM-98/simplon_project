import { HttpClient } from "@angular/common/http"
import { Injectable } from "@angular/core"
import { Observable } from "rxjs"
import { Menu } from "../models/Menu"



@Injectable({
    providedIn: "root"
})

export class CarteService {

    constructor(private http: HttpClient){}

    APIurl :string = "http://localhost:8080"
    

    getAllAvis():Observable<Menu>{
       return this.http.get<Menu>(`${this.APIurl}/menu`)
    }

    getAvisById(id: number):Observable<Menu>{
        return this.http.get<Menu>(`${this.APIurl}/menus/${id}`)
    }

    newAvis(resa: Menu):Observable<Menu>{
        return this.http.post<Menu>(`${this.APIurl}/cartes/new`, resa)
    }

    deleteAvisById(id: number):Observable<Menu>{
        return this.http.delete<Menu>(`${this.APIurl}/cartes/${id}`)
    }
}