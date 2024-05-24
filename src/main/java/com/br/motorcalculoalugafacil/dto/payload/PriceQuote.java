package com.br.motorcalculoalugafacil.dto.payload;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record PriceQuote(
        List<Fees> lsFees,
        List<Comission> lsComission,
        List<Discount> lsDiscount,
        ExtraDriver mpExtraDriver,
        KmCar mpKmCar,
        @NotNull Car mpCar
) {
}
