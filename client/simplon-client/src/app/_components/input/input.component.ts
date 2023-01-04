import { Component, Input, ViewChild } from '@angular/core';
import { ControlContainer, ControlValueAccessor, FormControl, FormControlDirective, NG_VALUE_ACCESSOR } from '@angular/forms';

@Component({
  selector: 'app-input',
  templateUrl: './input.component.html',
  styleUrls: ['./input.component.scss'],
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: InputComponent,
      multi: true
    }
  ]
})
export class InputComponent implements ControlValueAccessor  {

  @Input() label!: string;
  @Input() field!: string;
  @Input() placeholder!: string;
  @Input() type: string = '';
  @Input() formControl: FormControl<any> | any;
  @Input() formControlName!: string;
  // @Output() value: EventEmitter<string> = new EventEmitter<string>();
  isPassword!: boolean;
  @ViewChild(FormControlDirective, { static: true })
  formControlDirective!: FormControlDirective;

  constructor(private controlContainer: ControlContainer) {}

  ngOnInit(): void {
    this.isPassword = this.type == 'password';
    this.formControl = new FormControl(this.formControlName);
    this.formControlName = this.field;
  }

  togglePassword() {

    if(this.type == 'text'){
      this.type = 'password';
    }
    else {
      this.type = 'text';
    }
  }

  get control() {
    if (this.controlContainer.control)
    return this.controlContainer.control.get(this.formControlName);
    return this.formControl;
  }

  registerOnTouched(fn: any): void {
    if (this.formControlDirective.valueAccessor)
    this.formControlDirective.valueAccessor.registerOnTouched(fn);
  }

  registerOnChange(fn: any): void {
    if (this.formControlDirective.valueAccessor)
    this.formControlDirective.valueAccessor.registerOnChange(fn);
  }

  writeValue(obj: any): void {
    if (this.formControlDirective.valueAccessor)
    this.formControlDirective.valueAccessor.writeValue(obj);
  }
}
