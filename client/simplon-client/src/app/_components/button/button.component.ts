import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.scss']
})
export class ButtonComponent {
  @Input() type!: string;
  @Input() className!: string;
  @Input() value!: string;
  @Input() icon!: any;
  @Output() click: EventEmitter<any|null> = new EventEmitter<any|null>();

  ngOnInit(): void {

  }
}
