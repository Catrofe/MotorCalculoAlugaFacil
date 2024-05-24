package com.br.motorcalculoalugafacil.dto.response;

import jakarta.validation.constraints.NotNull;

public record ExtraDriverOut(
        @NotNull Integer qtExtraDriver,
        @NotNull Double vlExtraDriverPerDay,
        @NotNull Double vlCalculate
) {
}
