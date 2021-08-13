import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgoShowCourseComponent } from './ngo-show-course.component';

describe('NgoShowCourseComponent', () => {
  let component: NgoShowCourseComponent;
  let fixture: ComponentFixture<NgoShowCourseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgoShowCourseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgoShowCourseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
