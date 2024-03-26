package dev.tadeupinheiro.apibudgettissue.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "TB_PRODUCT_MODEL")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    @NotBlank
    private String name;
    @NotBlank
    private double tissueConsumption;
    @NotBlank
    private double threadConsumption;
    @NotBlank
    @ManyToOne
    private ThreadRoll idThread;
    @NotNull
    private BigDecimal costThread;
    @ManyToOne
    @JoinColumn(name = "strip", nullable = false)
    private StripReflectiveConsumption stripReflectiveConsumption;

    @ManyToMany(mappedBy = "products", fetch = FetchType.EAGER)
    private List<CostBudget> costBudgets;


    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
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

    public ThreadRoll getIdThread() {
        return idThread;
    }

    public void setIdThread(ThreadRoll idThread) {
        this.idThread = idThread;
    }

    public BigDecimal getCostThread() {
        return costThread;
    }

    public void setCostThread(BigDecimal costThread) {
        this.costThread = costThread;
    }

    public StripReflectiveConsumption getStripReflectiveConsumption() {
        return stripReflectiveConsumption;
    }

    public void setStripReflectiveConsumption(StripReflectiveConsumption stripReflectiveConsumption) {
        this.stripReflectiveConsumption = stripReflectiveConsumption;
    }

    public BigDecimal calculateThreadCost (ThreadRoll threadRoll){

        var costPrice = threadRoll.getCostPriceRoll();
        return costPrice.multiply(new BigDecimal(this.threadConsumption));
    }

}
