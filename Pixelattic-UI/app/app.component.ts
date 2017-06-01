import { Component } from '@angular/core';

@Component({
    selector: 'pm-app',
    template :`
    <pm-nav></pm-nav>
    <pm-hero></pm-hero>
    `
})
export class AppComponent {
    pageTitle : String = "This is my UI";
 }
