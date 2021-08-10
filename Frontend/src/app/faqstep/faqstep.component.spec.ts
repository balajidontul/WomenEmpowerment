import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FaqstepComponent } from './faqstep.component';

describe('FaqstepComponent', () => {
  let component: FaqstepComponent;
  let fixture: ComponentFixture<FaqstepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FaqstepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FaqstepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
