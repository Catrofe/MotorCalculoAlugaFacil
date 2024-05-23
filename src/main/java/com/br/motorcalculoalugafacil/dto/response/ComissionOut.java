package com.br.motorcalculoalugafacil.dto.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ComissionOut(
        @NotBlank String nmComission,
        @NotNull Double vlComission,
        @NotNull Double pcComission,
        @NotNull Double vlCalculate

) {
}
