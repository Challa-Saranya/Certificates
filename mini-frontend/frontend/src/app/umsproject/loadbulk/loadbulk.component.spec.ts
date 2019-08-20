import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoadbulkComponent } from './loadbulk.component';

describe('LoadbulkComponent', () => {
  let component: LoadbulkComponent;
  let fixture: ComponentFixture<LoadbulkComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoadbulkComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoadbulkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
