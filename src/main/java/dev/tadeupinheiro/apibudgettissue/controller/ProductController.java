package dev.tadeupinheiro.apibudgettissue.controller;

import dev.tadeupinheiro.apibudgettissue.dto.ProductRecordDto;
import dev.tadeupinheiro.apibudgettissue.model.Product;
import dev.tadeupinheiro.apibudgettissue.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity saveProduct (@RequestBody @Valid ProductRecordDto productRecordDto){
        var product = new Product();
        if (productService.existsByIdProduct(productRecordDto.idProduct())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Product already exists");
        }
        BeanUtils.copyProperties(productRecordDto, product);

    }
}
