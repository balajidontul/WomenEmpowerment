import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StatusngoComponent } from './statusngo.component';

describe('StatusngoComponent', () => {
  let component: StatusngoComponent;
  let fixture: ComponentFixture<StatusngoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StatusngoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StatusngoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
