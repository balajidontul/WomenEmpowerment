import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FaqhomeComponent } from './faqhome.component';

describe('FaqhomeComponent', () => {
  let component: FaqhomeComponent;
  let fixture: ComponentFixture<FaqhomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FaqhomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FaqhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
