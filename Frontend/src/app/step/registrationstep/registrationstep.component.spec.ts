import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrationstepComponent } from './registrationstep.component';

describe('RegistrationstepComponent', () => {
  let component: RegistrationstepComponent;
  let fixture: ComponentFixture<RegistrationstepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrationstepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistrationstepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
