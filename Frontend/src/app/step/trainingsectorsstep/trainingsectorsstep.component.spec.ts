import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingsectorsstepComponent } from './trainingsectorsstep.component';

describe('TrainingsectorsstepComponent', () => {
  let component: TrainingsectorsstepComponent;
  let fixture: ComponentFixture<TrainingsectorsstepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrainingsectorsstepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainingsectorsstepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
