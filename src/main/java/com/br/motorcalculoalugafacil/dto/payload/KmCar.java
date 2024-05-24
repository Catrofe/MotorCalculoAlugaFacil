package com.br.motorcalculoalugafacil.dto.payload;

import jakarta.validation.constraints.NotNull;

public record KmCar(
        @NotNull Integer qtKm,
        @NotNull Double vlKm,
        @NotNull Integer chargeEveryKm
) {
}
