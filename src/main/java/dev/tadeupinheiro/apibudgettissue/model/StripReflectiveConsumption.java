package dev.tadeupinheiro.apibudgettissue.model;

import jakarta.persistence.Id;

public class StripReflectiveConsumption {
    @Id
    private Integer idStripConfiguration;
    private double sleeve;
    private double abdomenHorizontal;
    private double abdomenUprightDual;

}
