package dev.tadeupinheiro.apibudgettissue.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class CostBudget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToMany(fetch = FetchType.LAZY)
    //Ver se a anotação abaixo serve
    //@JoinTable(name = "costbudget_product", joinColumns = @JoinColumn(name = "costbudget_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;

    @NotNull
    @ManyToMany(fetch = FetchType.LAZY)
    private List<StripReflectiveTypes> stripReflectiveTypes;




}
