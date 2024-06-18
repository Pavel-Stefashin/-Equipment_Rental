package com.example.test.controllers;

import com.example.test.product.Product;
import com.example.test.services.ProductServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductServices productServices;

    @GetMapping("/")
    public String products(Model model){
        model.addAttribute("products", productServices.ShowAll());
        return "products";
    }

    @GetMapping ("/product/{id}")
    public String infoProduct(@PathVariable Long id, Model model){
        model.addAttribute("product", productServices.getProductById(id));
        return "product-info";
    }

    @PostMapping("/product/create")
    public String createProduct(Product product){
        productServices.AddProduct(product);
        return "redirect:/";
    }

    @PostMapping("product/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productServices.DeleteProduct(id);
        return "redirect:/";
    }

}
