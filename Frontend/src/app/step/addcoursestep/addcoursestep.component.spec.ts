import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddcoursestepComponent } from './addcoursestep.component';

describe('AddcoursestepComponent', () => {
  let component: AddcoursestepComponent;
  let fixture: ComponentFixture<AddcoursestepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddcoursestepComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddcoursestepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
