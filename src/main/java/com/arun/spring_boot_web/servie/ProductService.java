package com.arun.spring_boot_web.servie;

import com.arun.spring_boot_web.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProductService {
    List<Product> products = new ArrayList<> (Arrays.asList(
            new Product(101,"mouse", 299),
            new Product(102,"laptop", 53999),
            new Product(103, "keyboard", 499)));

    public List<Product> getProducts(){
        return products;
    }



    public Product getProductById(int id) {
        return products
                .stream()
                .filter(
                        (product) -> {
                    return product.getId() == id; }
                )
                .findFirst()

                .orElse(new Product(0, "product not found", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product newProduct) {
        products = products.stream()
                .map(product -> {
                    if (product.getId() == newProduct.getId()) {
                        return newProduct;
                    }
                    return product;
                })
                .collect(Collectors.toList());
        System.out.println(products.toString());
    }

    public void deleteProduct(int id) {
        products = products.stream()
                .filter(product -> product.getId() != id)
                .collect(Collectors.toList());
    }
}
