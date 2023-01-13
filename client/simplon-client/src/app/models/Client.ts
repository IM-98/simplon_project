import { Avis } from "./Avis";
import { Reservation } from "./Reservation";

export interface Client {
    id: number;
    nom: string;
    prenom: string;
    mail: string;
    avis: Array<Avis>;
    reservation: Array<Reservation>;
}