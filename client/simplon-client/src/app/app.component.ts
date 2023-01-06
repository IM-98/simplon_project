import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'filrouge';

  showButton: boolean = true;

  hideButton() {
    this.showButton = false;
  }

}
