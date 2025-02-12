package com.example.SpringProductCatalog.Controller;


import com.example.SpringProductCatalog.Entity.Product;
import com.example.SpringProductCatalog.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
         @Autowired

        private ProductService productService;

            @GetMapping("/")
            public String home() {

                return "index";
            }

            @GetMapping("/products")
            public String getProducts(Model model) {
                model.addAttribute("products", productService. getAllProducts());
                return "products";
            }
            @GetMapping("/addProduct")
             public String addProductPage(Model model)
            {
                model.addAttribute("product", new Product());
                return "addProduct";
             }

    @PostMapping("/addProduct")
    public String addProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
        }




}