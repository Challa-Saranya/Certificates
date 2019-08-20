import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoadsingleComponent } from './loadsingle.component';

describe('LoadsingleComponent', () => {
  let component: LoadsingleComponent;
  let fixture: ComponentFixture<LoadsingleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoadsingleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoadsingleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
