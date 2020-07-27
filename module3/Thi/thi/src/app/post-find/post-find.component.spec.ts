import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PostFindComponent } from './post-find.component';

describe('PostFindComponent', () => {
  let component: PostFindComponent;
  let fixture: ComponentFixture<PostFindComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PostFindComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PostFindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
