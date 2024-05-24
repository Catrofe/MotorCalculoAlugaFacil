package com.br.motorcalculoalugafacil.dto.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Car(
        @NotBlank String nmCar,
        @NotNull Double vlCarPerDay,
        @NotNull Integer qtCarDaysUse
) {
}
