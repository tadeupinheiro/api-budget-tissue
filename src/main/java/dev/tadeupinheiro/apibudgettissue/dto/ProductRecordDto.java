package dev.tadeupinheiro.apibudgettissue.dto;

import jakarta.validation.constraints.NotBlank;

public record ProductRecordDto (
        @NotBlank Integer idProduct,
    @NotBlank String name,
    @NotBlank double tissueConsumption,
    @NotBlank double threadConsumption,
    @NotBlank String idThread,
    @NotBlank Integer idStripConfiguration,
        @NotBlank Integer idStripReflectiveTypes
) {}
