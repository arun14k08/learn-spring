package com.arun.spring_boot_web.servie;

import com.arun.spring_boot_web.model.Product;
import com.arun.spring_boot_web.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;
//    List<Product> products = new ArrayList<> (Arrays.asList(
//            new Product(101,"mouse", 299),
//            new Product(102,"laptop", 53999),
//            new Product(103, "keyboard", 499)));

    public List<Product> getProducts(){
        return productRepo.findAll();
    }



    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(new Product());
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(Product newProduct) {
        productRepo.save(newProduct);
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }
}
