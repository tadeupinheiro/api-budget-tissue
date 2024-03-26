package dev.tadeupinheiro.apibudgettissue.controller;

import dev.tadeupinheiro.apibudgettissue.dto.ProductRecordDto;
import dev.tadeupinheiro.apibudgettissue.model.Product;
import dev.tadeupinheiro.apibudgettissue.service.ProductService;
import dev.tadeupinheiro.apibudgettissue.service.ThreadRollService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    ThreadRollService threadRollService;

    @PostMapping
    public ResponseEntity<Product> saveProduct (@RequestBody @Valid ProductRecordDto productRecordDto){
        var product = new Product();
        if (productService.existsByIdProduct(productRecordDto.idProduct())){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        else if (threadRollService.existsByIdThread(productRecordDto.idThread())){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        BeanUtils.copyProperties(productRecordDto, product);
        var threadCost = product.calculateThreadCost(threadRollService.findByIdThread(productRecordDto.idThread()).get());
        product.setCostThread(threadCost);
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(product));
    }
}
