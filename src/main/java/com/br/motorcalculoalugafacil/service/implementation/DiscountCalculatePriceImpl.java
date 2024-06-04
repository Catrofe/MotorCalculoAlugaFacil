package com.br.motorcalculoalugafacil.service.implementation;

import com.br.motorcalculoalugafacil.dto.payload.Discount;
import com.br.motorcalculoalugafacil.dto.response.DiscountOut;
import com.br.motorcalculoalugafacil.port.DiscountCalculatePrice;

import java.util.List;

public class DiscountCalculatePriceImpl implements DiscountCalculatePrice {
    @Override
    public List<DiscountOut> calculatePrice(List<Discount> discount) {
        return List.of();
    }
}
