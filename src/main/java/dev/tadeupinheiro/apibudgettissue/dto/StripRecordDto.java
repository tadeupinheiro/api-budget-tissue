package dev.tadeupinheiro.apibudgettissue.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public record StripRecordDto (
        @Id Integer idStripConfiguration,
        @NotBlank double sleeve,
        @NotBlank double abdomenHorizontal,
        @NotBlank double abdomenUprightDual
){
}
