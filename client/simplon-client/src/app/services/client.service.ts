import { HttpClient } from "@angular/common/http"
import { Injectable } from "@angular/core"
import { Observable } from "rxjs"
import { Client } from "../models/Client"

@Injectable({
    providedIn: "root"
})

export class ClientService {

    constructor(private http: HttpClient){}

    APIurl :string = "http://localhost:8080"
    

    getAllClient():Observable<Client[]>{
       return this.http.get<Client[]>(`${this.APIurl}/clients`)
    }

    getClientById(id: number):Observable<Client>{
        return this.http.get<Client>(`${this.APIurl}/clients/${id}`)
    }

    newClient(resa: Client):Observable<Client>{
        return this.http.post<Client>(`${this.APIurl}/clients/new`, resa)
    }

    deleteClientById(id: number):Observable<Client>{
        return this.http.delete<Client>(`${this.APIurl}/clients/${id}`)
    }
}