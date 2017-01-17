package com.allstate.controllers;

import com.allstate.entities.Product;
import com.allstate.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    private ProductsService service;

    @Autowired
    public void setService(ProductsService service) {
        this.service = service;
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public Product create(@RequestBody Product product){
        return this.service.create(product);
    }
}
