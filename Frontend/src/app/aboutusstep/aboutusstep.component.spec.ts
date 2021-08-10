import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutusstepComponent } from './aboutusstep.component';

describe('AboutusstepComponent', () => {
  let component: AboutusstepComponent;
  let fixture: ComponentFixture<AboutusstepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AboutusstepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AboutusstepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
