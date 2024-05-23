package com.br.motorcalculoalugafacil.dto.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CarOut(
        @NotBlank String nmCar,
        @NotNull Double vlCarPerDay,
        @NotNull Integer qtCarDaysUse,
        @NotNull Double vlCalculate
) {
}
