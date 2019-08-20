import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletebulkComponent } from './deletebulk.component';

describe('DeletebulkComponent', () => {
  let component: DeletebulkComponent;
  let fixture: ComponentFixture<DeletebulkComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeletebulkComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeletebulkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
