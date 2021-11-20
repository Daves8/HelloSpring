import { Component, OnInit } from '@angular/core';
import {Product} from "../product";
import {ProductServiceService} from "../product-service.service";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[] | undefined;

  constructor(private productService: ProductServiceService) {
  }

  ngOnInit() {
    this.productService.getProducts().subscribe(data => {
      this.products = data;
    });
  }
}
