import { Menu } from "./Menu";

export interface Carte {
    id: number;
    image: string;
    nom: string;
    resume: string;
    menu: Menu[];
}