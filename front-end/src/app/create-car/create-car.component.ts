import { CarService } from '../car.service';
import { Car } from '../car';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-car',
  templateUrl: './create-car.component.html',
  styleUrls: ['./create-car.component.css']
})
export class CreateCarComponent implements OnInit {

  car: Car = new Car();
  submitted = false;

  constructor(private carService: CarService,
    private router: Router) { }

  ngOnInit() {
  }

  newCar(): void {
    this.submitted = false;
    this.car = new Car();
  }

  save() {
    this.carService.createCar(this.car)
      .subscribe(data => { console.log(data); this.gotoList();}, error => console.log(error));
    this.car = new Car();
   
  }

  onSubmit() {
    this.submitted = true;
    this.save(); 
  }

  gotoList() {
    this.router.navigate(['cars']);
  }
}
