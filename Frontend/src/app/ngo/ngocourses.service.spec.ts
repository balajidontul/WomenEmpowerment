import { TestBed } from '@angular/core/testing';

import { NgocoursesService } from './ngocourses.service';

describe('NgocoursesService', () => {
  let service: NgocoursesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NgocoursesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
