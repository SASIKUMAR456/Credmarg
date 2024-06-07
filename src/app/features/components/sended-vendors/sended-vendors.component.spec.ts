import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SendedVendorsComponent } from './sended-vendors.component';

describe('SendedVendorsComponent', () => {
  let component: SendedVendorsComponent;
  let fixture: ComponentFixture<SendedVendorsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SendedVendorsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SendedVendorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
