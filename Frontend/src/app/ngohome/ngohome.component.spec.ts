import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgohomeComponent } from './ngohome.component';

describe('NgohomeComponent', () => {
  let component: NgohomeComponent;
  let fixture: ComponentFixture<NgohomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgohomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgohomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
