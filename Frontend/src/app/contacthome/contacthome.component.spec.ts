import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContacthomeComponent } from './contacthome.component';

describe('ContacthomeComponent', () => {
  let component: ContacthomeComponent;
  let fixture: ComponentFixture<ContacthomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContacthomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContacthomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
