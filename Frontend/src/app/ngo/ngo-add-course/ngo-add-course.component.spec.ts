import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgoAddCourseComponent } from './ngo-add-course.component';

describe('NgoAddCourseComponent', () => {
  let component: NgoAddCourseComponent;
  let fixture: ComponentFixture<NgoAddCourseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgoAddCourseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgoAddCourseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
