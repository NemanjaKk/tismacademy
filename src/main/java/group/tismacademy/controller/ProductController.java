package group.tismacademy.controller;

import group.tismacademy.entity.Category;
import group.tismacademy.entity.Product;
import group.tismacademy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/products/category/{category}")
    public Product addProduct(@PathVariable Category category, @RequestBody Product product) {
        return service.saveProduct(product, category);
    }

    @PostMapping("/products/many")
    public List<Product> addProduct(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping("/products/name/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
