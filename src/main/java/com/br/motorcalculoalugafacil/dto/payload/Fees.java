package com.br.motorcalculoalugafacil.dto.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Fees(
        @NotBlank String nmFees,
        @NotNull Double vlFees,
        @NotNull Double pcFees
) {
}
