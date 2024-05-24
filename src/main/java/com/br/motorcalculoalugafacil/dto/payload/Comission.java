package com.br.motorcalculoalugafacil.dto.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Comission(
        @NotBlank String nmComission,
        @NotNull Double vlComission,
        @NotNull Double pcComission

) {
}
