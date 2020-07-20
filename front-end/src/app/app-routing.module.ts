import { CarDetailsComponent } from './car-details/car-details.component';
import { CreateCarComponent } from './create-car/create-car.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarListComponent } from './car-list/car-list.component';
import { UpdateCarComponent } from './update-car/update-car.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
 
  {path: 'login', component: LoginComponent},
  {path: '', component: LoginComponent},
  { path: 'cars', component: CarListComponent },
  { path: 'add', component: CreateCarComponent },
  { path: 'update/:id', component: UpdateCarComponent },
  { path: 'details/:id', component: CarDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
