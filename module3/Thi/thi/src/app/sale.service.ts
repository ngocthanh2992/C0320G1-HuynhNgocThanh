import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class SaleService {
  public API: string = 'http://localhost:3000/posts';

  constructor(public http: HttpClient) { }

  getAllPost(): Observable<any>{
    return this.http.get(this.API);
  }

  addNewPost(post): Observable<any>{
    return this.http.post(this.API, post);
  }

  getPostByID(postId): Observable<any>{
    return this.http.get(this.API + '/' + postId);
  }

}
