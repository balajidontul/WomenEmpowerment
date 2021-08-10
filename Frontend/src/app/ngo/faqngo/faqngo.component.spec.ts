import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FaqngoComponent } from './faqngo.component';

describe('FaqngoComponent', () => {
  let component: FaqngoComponent;
  let fixture: ComponentFixture<FaqngoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FaqngoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FaqngoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
