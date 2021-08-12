import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuidelinestepComponent } from './guidelinestep.component';

describe('GuidelinestepComponent', () => {
  let component: GuidelinestepComponent;
  let fixture: ComponentFixture<GuidelinestepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GuidelinestepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GuidelinestepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
