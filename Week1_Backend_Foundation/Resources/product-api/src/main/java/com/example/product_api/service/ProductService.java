package com.example.product_api.service;

import com.example.product_api.model.Product;
import com.example.product_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    // Create
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    // Read All
    public List<Product> getAllProducts() {
        List<Product> allProducts = productRepository.findAll();
        return allProducts.isEmpty() ? null : allProducts;
    }
    // Read
    public Product getProductById(int id) {
        return productRepository.findById((long) id).orElse(null);
    }
    // Update
    public Product updateProduct(int id, Product product) {
        Product existingProduct = productRepository.findById((long) id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setQuantity(product.getQuantity());
            return productRepository.save(existingProduct);
        }
        return null;
    }
    // Delete
    public void deleteProduct(int id) {
        productRepository.deleteById((long) id);
    }
}
