package com.br.motorcalculoalugafacil.dto.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Discount(
        @NotBlank String nmDiscount,
        @NotNull Double vlDiscount,
        @NotNull Double pcDiscount
) {
}
