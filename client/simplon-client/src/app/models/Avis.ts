import { Client } from "./Client";

export interface Avis {
    id: number;
    text: string;
    titre: string;
    date: Date;
    nomClient: string;
}