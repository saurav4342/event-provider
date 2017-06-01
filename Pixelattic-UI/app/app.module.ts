import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import { NavComponent} from './landing-page/navbar.component'
import {HeroImgComponent} from './landing-page/hero-image/hero-image.component'
@NgModule({
  imports: [ BrowserModule ],
  declarations: [ AppComponent,NavComponent,HeroImgComponent ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }
