import { Client } from "./Client";
import { Menu } from "./Menu";

export interface Reservation {
    id: number;
    horaire: Date;
    nbrPersonne: number;
    client: Client;
    commande: Array<Menu>;
}
