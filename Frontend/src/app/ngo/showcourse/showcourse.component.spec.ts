import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowcourseComponent } from './showcourse.component';

describe('ShowcourseComponent', () => {
  let component: ShowcourseComponent;
  let fixture: ComponentFixture<ShowcourseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowcourseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowcourseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
