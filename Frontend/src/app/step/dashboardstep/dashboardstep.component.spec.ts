import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DashboardstepComponent } from './dashboardstep.component';

describe('DashboardstepComponent', () => {
  let component: DashboardstepComponent;
  let fixture: ComponentFixture<DashboardstepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DashboardstepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DashboardstepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
