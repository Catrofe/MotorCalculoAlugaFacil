package com.br.motorcalculoalugafacil.dto.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FeesOut(
        @NotBlank String nmFees,
        @NotNull Double vlFees,
        @NotNull Double pcFees,
        @NotNull Double vlCalculate
) {
}
