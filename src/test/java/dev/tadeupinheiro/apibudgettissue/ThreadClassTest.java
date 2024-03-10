package dev.tadeupinheiro.apibudgettissue;

import dev.tadeupinheiro.apibudgettissue.repository.ThreadRollRepository;
import dev.tadeupinheiro.apibudgettissue.service.ThreadRollService;

import java.math.BigDecimal;

public class ThreadClassTest {
    public static void main(String[] args) {

        ThreadRollRepository tr = null;
        ThreadRollService ts = new ThreadRollService(tr);

        BigDecimal costThreadRoll = new BigDecimal("5.00");
        BigDecimal sizeThreadRoll = new BigDecimal("100");

        BigDecimal costThreadMeter = new BigDecimal(0);

        costThreadMeter = costThreadRoll.divide(sizeThreadRoll);

        System.out.println(costThreadMeter);

    }
}
