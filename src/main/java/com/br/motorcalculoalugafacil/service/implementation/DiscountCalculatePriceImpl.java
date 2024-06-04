package com.br.motorcalculoalugafacil.service.implementation;

import com.br.motorcalculoalugafacil.dto.payload.Discount;
import com.br.motorcalculoalugafacil.dto.response.DiscountOut;
import com.br.motorcalculoalugafacil.port.DiscountCalculatePrice;

import java.util.List;

public class DiscountCalculatePriceImpl implements DiscountCalculatePrice {
    @Override
    public List<DiscountOut> calculatePrice(List<Discount> discounts, Double price) {
        return discounts.stream().map(discount -> calculateDiscount(discount, price)).toList();
    }

    private DiscountOut calculateDiscount(Discount discount, Double price) {
        Double discountValue = (price * discount.pcDiscount() / 100) + discount.vlDiscount();
        return new DiscountOut(discount.nmDiscount(), discount.vlDiscount(), discount.pcDiscount(), discountValue);
    }
}
