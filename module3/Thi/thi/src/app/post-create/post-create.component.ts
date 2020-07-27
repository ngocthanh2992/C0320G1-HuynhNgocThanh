import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from "@angular/forms";
import {SaleService} from "../sale.service";
import { Router } from '@angular/router';

@Component({
  selector: 'app-post-create',
  templateUrl: './post-create.component.html',
  styleUrls: ['./post-create.component.css']
})
export class PostCreateComponent implements OnInit {

  createPostForm: FormGroup;

  constructor(private fb: FormBuilder,
              public saleService: SaleService,
              public router: Router) {
  }

  ngOnInit() {
    this.createPostForm = this.fb.group({
      type: [''],
      country: [''],
      personal: [''],
      typeService: [''],
      status: [''],
      address: ['',Validators.required],
      area: ['', [Validators.required,Validators.min(20)]],
      where: [''],
      title: ['',Validators.required],
      comment: ['',Validators.required],
      price: ['',[Validators.required, Validators.min(100000000)]],
      image: ['']
    })
  }

  onSubmit() {
    this.saleService.addNewPost(this.createPostForm.value).subscribe(data=>{
      this.router.navigateByUrl('post/list');
      alert("Thêm mới thành công!")
    });
  }

}
