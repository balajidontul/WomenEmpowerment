import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StatusstepComponent } from './statusstep.component';

describe('StatusstepComponent', () => {
  let component: StatusstepComponent;
  let fixture: ComponentFixture<StatusstepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StatusstepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StatusstepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
