import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PolicyhomeComponent } from './policyhome.component';

describe('PolicyhomeComponent', () => {
  let component: PolicyhomeComponent;
  let fixture: ComponentFixture<PolicyhomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PolicyhomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PolicyhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
