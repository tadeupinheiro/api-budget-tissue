package dev.tadeupinheiro.apibudgettissue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;


@Entity
@Table(name = "TB_THREADROLL_MODEL")
public class ThreadRoll {

    @Id
    private String name;
    @NotBlank
    private BigDecimal costPriceRoll;
    @NotBlank
    private double size;
    @NotBlank
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCostPriceRoll() {
        return costPriceRoll;
    }

    public void setCostPriceRoll(BigDecimal costPriceRoll) {
        this.costPriceRoll = costPriceRoll;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
