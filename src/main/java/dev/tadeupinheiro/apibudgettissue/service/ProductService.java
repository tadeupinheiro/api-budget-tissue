package dev.tadeupinheiro.apibudgettissue.service;

import dev.tadeupinheiro.apibudgettissue.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductService {

    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public BigDecimal paintingCalculation (int quantityColorsSmallPainting, int quantityColorsBigPainting, BigDecimal costColorBigPainting, BigDecimal costColorSmallPainting){

        BigDecimal costSmallPainting = costColorSmallPainting.multiply(BigDecimal.valueOf(quantityColorsSmallPainting));
        BigDecimal costBigPainting = costColorBigPainting.multiply(BigDecimal.valueOf(quantityColorsBigPainting));

        BigDecimal total = new BigDecimal(0);
        total = total.add(costBigPainting);
        total = total.add(costSmallPainting);
        return total;
    };

}
