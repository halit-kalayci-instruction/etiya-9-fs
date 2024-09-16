package com.etiya;

public class ProductService
{
   // SOLID =>
   // D => Dependency Inversion

   // Bir nesnenin bağımlılığı, o nesnenin içerisinde değil kullanıldığı noktada belirlenmelidir.

   ProductRepo productRepo;
   public ProductService(ProductRepo productRepo) {
      this.productRepo = productRepo;
   }
   // Enjekte

   public void save(Product product) {
      productRepo.save(product);
   }
   public void sell(Product product) {
      //...
      product.setStock(product.getStock() - 1);
      // productRepo.update(product);
   }
}
