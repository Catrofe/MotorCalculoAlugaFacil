package com.br.motorcalculoalugafacil.dto.response;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record PriceQuoteOut(
        List<FeesOut> lsFees,
        List<ComissionOut> lsComission,
        List<DiscountOut> lsDiscount,
        ExtraDriverOut mpExtraDriver,
        @NotNull CarOut mpCar
) {
}
