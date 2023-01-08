import { Component, EventEmitter, Output } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})

export class HeaderComponent {

  nav: string[];

    constructor(private router:Router){
      this.nav = ['cartes & menu','localisation','avis','contact'];
    }
}
