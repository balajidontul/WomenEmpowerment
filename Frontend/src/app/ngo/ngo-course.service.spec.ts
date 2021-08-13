import { TestBed } from '@angular/core/testing';

import { NgoCourseService } from './ngo-course.service';

describe('NgoCourseService', () => {
  let service: NgoCourseService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NgoCourseService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
