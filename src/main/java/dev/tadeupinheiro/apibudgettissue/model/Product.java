package dev.tadeupinheiro.apibudgettissue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUCT_MODEL0")
public class Product {

    @Id
    private String name;
    @NotBlank
    private double tissueConsumption;
    @NotBlank
    private double threadConsumption;
    @NotBlank
    private double stripReflectiveConsumption;
    @NotBlank
    private double elasticConsumption;
    @NotBlank
    private BigDecimal paintingConsumption;

    public BigDecimal paintingCalculation (int quantityColorsSmallPainting, int quantityColorsBigPainting, BigDecimal costColorBigPainting, BigDecimal costColorSmallPainting){

        BigDecimal costSmallPainting = costColorSmallPainting.multiply(BigDecimal.valueOf(quantityColorsSmallPainting));
        BigDecimal costBigPainting = costColorBigPainting.multiply(BigDecimal.valueOf(quantityColorsBigPainting));

        BigDecimal total = new BigDecimal(0);
        total = total.add(costBigPainting);
        total = total.add(costSmallPainting);
        return total;
    };

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

    public double getElasticConsumption() {
        return elasticConsumption;
    }

    public void setElasticConsumption(double elasticConsumption) {
        this.elasticConsumption = elasticConsumption;
    }

    public BigDecimal getPaintingConsumption() {
        return paintingConsumption;
    }

    public void setPaintingConsumption(BigDecimal paintingConsumption) {
        this.paintingConsumption = paintingConsumption;
    }
}
