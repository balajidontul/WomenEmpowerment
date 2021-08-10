import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuidelinesstepComponent } from './guidelinesstep.component';

describe('GuidelinesstepComponent', () => {
  let component: GuidelinesstepComponent;
  let fixture: ComponentFixture<GuidelinesstepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GuidelinesstepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GuidelinesstepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
