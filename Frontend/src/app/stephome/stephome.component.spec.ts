import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StephomeComponent } from './stephome.component';

describe('StephomeComponent', () => {
  let component: StephomeComponent;
  let fixture: ComponentFixture<StephomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StephomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StephomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
