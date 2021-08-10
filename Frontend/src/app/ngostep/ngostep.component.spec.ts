import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgostepComponent } from './ngostep.component';

describe('NgostepComponent', () => {
  let component: NgostepComponent;
  let fixture: ComponentFixture<NgostepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgostepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgostepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
