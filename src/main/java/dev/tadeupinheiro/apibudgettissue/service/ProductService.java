package dev.tadeupinheiro.apibudgettissue.service;

import dev.tadeupinheiro.apibudgettissue.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


}
