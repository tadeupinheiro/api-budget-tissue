package dev.tadeupinheiro.apibudgettissue.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUCT_MODEL")
public class Product {

    @Id
    private String idProduct;
    @NotBlank
    private String name;
    @NotBlank
    private double tissueConsumption;
    @NotBlank
    private double threadConsumption;
    @ManyToOne
    @JoinColumn(name = "strip", nullable = false)
    private StripReflectiveConsumption stripReflectiveConsumption;


    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTissueConsumption() {
        return tissueConsumption;
    }

    public void setTissueConsumption(double tissueConsumption) {
        this.tissueConsumption = tissueConsumption;
    }

    public double getThreadConsumption() {
        return threadConsumption;
    }

    public void setThreadConsumption(double threadConsumption) {
        this.threadConsumption = threadConsumption;
    }

    public double getStripReflectiveConsumption() {
        return stripReflectiveConsumption;
    }

    public void setStripReflectiveConsumption(double stripReflectiveConsumption) {
        this.stripReflectiveConsumption = stripReflectiveConsumption;
    }

}
