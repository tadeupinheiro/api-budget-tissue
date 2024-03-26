package dev.tadeupinheiro.apibudgettissue.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "TB_STRIP_REF_TYPES")
public class StripReflectiveTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(max = 30)
    private String name;

    @NotBlank
    @Size(max = 15)
    private BigDecimal price;

    @NotBlank
    @Size(max = 4)
    private Long width;

    @NotBlank
    @Size(max = 6)
    private String typeTreatment; //if flame retardant or normal

    @NotBlank
    @Size(max = 60)
    private String typeMaterial; //if gorgurao, sitellfill or other

    @ManyToMany(mappedBy = "stripReflectiveTypes", fetch = FetchType.LAZY)
    private List<CostBudget> costBudgets;
}
