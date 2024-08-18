package com.arun.spring_boot_web.servie;

import com.arun.spring_boot_web.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101,"mouse", 299),
            new Product(102,"laptop", 53999),
            new Product(103, "keyboard", 499));

    public List<Product> getProducts(){
        return products;
    }


}
