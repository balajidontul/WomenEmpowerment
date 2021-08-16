import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoutngoComponent } from './logoutngo.component';

describe('LogoutngoComponent', () => {
  let component: LogoutngoComponent;
  let fixture: ComponentFixture<LogoutngoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoutngoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LogoutngoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
