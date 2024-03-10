package dev.tadeupinheiro.apibudgettissue;

import dev.tadeupinheiro.apibudgettissue.model.Product;
import dev.tadeupinheiro.apibudgettissue.repository.ProductRepository;
import dev.tadeupinheiro.apibudgettissue.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class ProductClassTest {

    public static void main(String[] args) {
        Product p1 = new Product();

        ProductRepository productRepository = null;
        ProductService ps = new ProductService(productRepository);

        BigDecimal costColorBigPainting = new BigDecimal("1.55");
        BigDecimal costColorSmallPainting = new BigDecimal("1.10");

        p1.setPaintingConsumption(ps.paintingCalculation(1, 1, costColorBigPainting, costColorSmallPainting));
        System.out.println(p1.getPaintingConsumption());

    }
}
