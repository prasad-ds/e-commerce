package com.allstate.services;

import com.allstate.entities.Product;
import com.allstate.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    private IProductRepository productRepository;

    @Autowired
    public void setProductRepository(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(Product product){
        return this.productRepository.save(product);
    }


}
