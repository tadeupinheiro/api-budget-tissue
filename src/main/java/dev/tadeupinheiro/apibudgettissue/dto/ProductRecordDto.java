package dev.tadeupinheiro.apibudgettissue.dto;

import jakarta.validation.constraints.NotBlank;

public record ProductRecordDto (
        @NotBlank String idProduct,
    @NotBlank String name,
    @NotBlank double tissueConsumption,
    @NotBlank double threadConsumption,
    @NotBlank double stripReflectiveConsumption
) {}
