import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import {Component, OnInit} from "@angular/core";

describe('FontSizeEditorComponent', () => {
  let component: FontSizeEditorComponent;
  let fixture: ComponentFixture<FontSizeEditorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FontSizeEditorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FontSizeEditorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
@Component({
  selector:'app-font-size-editor',
  templateUrl:'./font-size-editor.component.html',
  styleUrls:['./font-size-editor.component.css']
})
export class FontSizeEditorComponent implements OnInit{

  fontSize=14;

  onChange(value){
    this.fontSize=value
  }

  constructor() {
  }

  ngOnInit(): void {
  }


}
