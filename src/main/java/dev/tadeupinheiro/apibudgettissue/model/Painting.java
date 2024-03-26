package dev.tadeupinheiro.apibudgettissue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

@Entity
public class Painting {

    @Id
    private Integer id;

    @NotBlank
    private BigDecimal pricePerColor;
}
