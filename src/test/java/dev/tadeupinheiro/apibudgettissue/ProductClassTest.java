package dev.tadeupinheiro.apibudgettissue;

import dev.tadeupinheiro.apibudgettissue.model.Product;

import java.math.BigDecimal;

public class ProductClassTest {

    public static void main(String[] args) {
        Product p1 = new Product();

        BigDecimal costColorBigPainting = new BigDecimal("1.55");
        BigDecimal costColorSmallPainting = new BigDecimal("1.10");

        p1.setPaintingConsumption(p1.paintingCalculation(1, 1, costColorBigPainting, costColorSmallPainting));
        System.out.println(p1.getPaintingConsumption());

    }
}
