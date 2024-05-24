package com.br.motorcalculoalugafacil.dto.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DiscountOut(
        @NotBlank String nmDiscount,
        @NotNull Double vlDiscount,
        @NotNull Double pcDiscount,
        @NotNull Double vlCalculate
) {
}
