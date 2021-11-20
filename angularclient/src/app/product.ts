export class Product {
  name: string;
  description: string;
  number: number;
  isInStock: boolean;

  constructor(name: string, description: string, number: number, isInStock: boolean) {
    this.name = name;
    this.description = description;
    this.number = number;
    this.isInStock = isInStock;
  }
}
