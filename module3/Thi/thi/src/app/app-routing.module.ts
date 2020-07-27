import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PostComponent} from "./post/post.component";
import {PostListComponent} from "./post-list/post-list.component";
import {PostCreateComponent} from "./post-create/post-create.component";


const routes: Routes = [
  {
  path: '',
  component: PostComponent
},
  {
    path: 'post/list',
    component: PostListComponent
  },
  {
    path: 'post/create',
    component: PostCreateComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
