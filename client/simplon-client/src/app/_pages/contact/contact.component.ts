import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.scss']
})
export class ContactComponent {

  contactForm!: FormGroup;

  constructor(private formBuilder: FormBuilder, private router: Router) {}

  ngOnInit(): void {
    this.contactForm = this.formBuilder.group ({
        username: ['', [
          Validators.required,
          Validators.minLength(5),
          Validators.maxLength(15)
        ]],
        email: ['', [
          Validators.required,
          Validators.email
        ]],
        message: ['', [
          Validators.required,
          Validators.minLength(500)
        ]]

      });
}
      get username() {
        return this.contactForm.get('username') as FormControl;
      }
      get email() {
        return this.contactForm.get('email') as FormControl;
      }
      get message() {
        return this.contactForm.get('message') as FormControl;
      }

  onSubmit() {
    if (this.contactForm!.valid) {

      alert('Formulaire valide !');
    } else {
      alert('Formulaire invalide !');
    }
  }
}

