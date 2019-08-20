import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ColorcheckingComponent } from './colorchecking.component';

describe('ColorcheckingComponent', () => {
  let component: ColorcheckingComponent;
  let fixture: ComponentFixture<ColorcheckingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ColorcheckingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ColorcheckingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
