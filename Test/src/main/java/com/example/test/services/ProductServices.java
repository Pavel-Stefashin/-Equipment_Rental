package com.example.test.services;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.test.product.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {

    private List<Product> productArr = new ArrayList<>();

    private long id = 0;

//    {
//        productArr.add(new Product(++id,"Chevrolet Camaro", 3500000));
//        productArr.add(new Product(++id,"Chevrolet Civic", 1500000));
//    }

    public List<Product> ShowAll(){ return productArr; }

    public void AddProduct(Product product){
        product.setId(++id);
        productArr.add(product);
    }

    public void DeleteProduct(Long id){
        productArr.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : productArr) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
