import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletesingleComponent } from './deletesingle.component';

describe('DeletesingleComponent', () => {
  let component: DeletesingleComponent;
  let fixture: ComponentFixture<DeletesingleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeletesingleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeletesingleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
