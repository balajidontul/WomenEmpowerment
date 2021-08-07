import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NGOComponent } from './ngo.component';

describe('NGOComponent', () => {
  let component: NGOComponent;
  let fixture: ComponentFixture<NGOComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NGOComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NGOComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
