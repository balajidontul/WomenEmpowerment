import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisterngoComponent } from './registerngo.component';

describe('RegisterngoComponent', () => {
  let component: RegisterngoComponent;
  let fixture: ComponentFixture<RegisterngoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegisterngoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegisterngoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
