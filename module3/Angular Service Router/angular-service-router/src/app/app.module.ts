import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DateUtilComponent } from './date-util/date-util.component';
import { StudentComponent } from './student/student.component';
import { StudentDetailComponent } from './student-detail/student-detail.component';
import {FormsModule} from "@angular/forms";
import { YoutubePlaylistComponent } from './youtube-playlist/youtube-playlist.component';
import { YoutubePlayerComponent } from './youtube-player/youtube-player.component';
import { DictionaryComponent } from './dictionary/dictionary.component';
import { DictionaryDetailComponent } from './dictionary-detail/dictionary-detail.component';
import { DictionaryPageComponent } from './dictionary-page/dictionary-page.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    DateUtilComponent,
    StudentComponent,
    StudentDetailComponent,
    YoutubePlaylistComponent,
    YoutubePlayerComponent,
    DictionaryComponent,
    DictionaryDetailComponent,
    DictionaryPageComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
