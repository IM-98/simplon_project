import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Avis } from 'src/app/models/Avis';
import { AvisService } from 'src/app/services/avis.service';
@Component({
  selector: 'app-avis',
  templateUrl: './avis.component.html',
  styleUrls: ['./avis.component.scss']
})
export class AvisComponent {

  avisForm!: FormGroup;
  // listeAvis!: Avis[]

  constructor(private formBuilder: FormBuilder, private router: Router, private avisService: AvisService) {}

  getAvis(){
    this.avisService.getAllAvis().subscribe(res =>{ 
      // this.listeAvis = res
    console.log(res)})
  }



  ngOnInit(): void {

    this.getAvis()
  
    this.avisForm = this.formBuilder.group ({
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
        return this.avisForm.get('username') as FormControl;
      }
      get email() {
        return this.avisForm.get('email') as FormControl;
      }
      get message() {
        return this.avisForm.get('message') as FormControl;
      }

  onSubmit() {
    if (this.avisForm!.valid) {

      alert('Formulaire valide !');
    } else {
      alert('Formulaire invalide !');
    }
  }
}
