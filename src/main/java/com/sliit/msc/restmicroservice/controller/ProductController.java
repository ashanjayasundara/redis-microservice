package com.sliit.msc.restmicroservice.controller;

import com.sliit.msc.restmicroservice.entity.Product;
import com.sliit.msc.restmicroservice.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ashan on 2021-12-06
 */
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductDao productDao;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productDao.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productDao.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id) {
        return productDao.deleteProduct(id);
    }

}
