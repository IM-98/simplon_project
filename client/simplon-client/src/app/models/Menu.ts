import { Carte } from "./Carte";
import { Reservation } from "./Reservation";

export interface Menu {
    id: number;
    entree: string;
    plat: string;
    dessert: string;
    urlImage: string;
    carte: Carte;
    reservation: Reservation;
    }