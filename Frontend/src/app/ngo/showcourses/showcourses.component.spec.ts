import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowcoursesComponent } from './showcourses.component';

describe('ShowcoursesComponent', () => {
  let component: ShowcoursesComponent;
  let fixture: ComponentFixture<ShowcoursesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowcoursesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowcoursesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
