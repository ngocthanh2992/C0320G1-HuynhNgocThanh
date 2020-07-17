import {NgModule} from '@angular/core';
import {Routes, RouterModule, PreloadAllModules} from '@angular/router';
import {DateUtilComponent} from "./date-util/date-util.component";
import {YoutubePlaylistComponent} from "./youtube-playlist/youtube-playlist.component";
import {YoutubePlayerComponent} from "./youtube-player/youtube-player.component";
import {DictionaryPageComponent} from "./dictionary-page/dictionary-page.component";
import {DictionaryDetailComponent} from "./dictionary-detail/dictionary-detail.component";
import {HomeComponent} from "./home/home.component";


const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'timelines',
    component: DateUtilComponent
  },
  {
    path: 'youtube',
    component: YoutubePlaylistComponent,
    children: [{
      path: ':id',
      component: YoutubePlayerComponent
    }]
  },
  {
    path: 'dictionary',
    component: DictionaryPageComponent,
    children: [
      {
        path: ':key',
        component: DictionaryDetailComponent
      }]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    preloadingStrategy: PreloadAllModules
  })],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
