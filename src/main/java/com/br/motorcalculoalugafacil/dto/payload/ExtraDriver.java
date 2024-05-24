package com.br.motorcalculoalugafacil.dto.payload;

import jakarta.validation.constraints.NotNull;

public record ExtraDriver(
        @NotNull Integer qtExtraDriver,
        @NotNull Double vlExtraDriverPerDay
) {
}
