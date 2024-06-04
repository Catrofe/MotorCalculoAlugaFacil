package com.br.motorcalculoalugafacil.port;

import com.br.motorcalculoalugafacil.dto.payload.Discount;
import com.br.motorcalculoalugafacil.dto.response.DiscountOut;

import java.util.List;

public interface DiscountCalculatePrice {

    List<DiscountOut> calculatePrice(List<Discount> discount);

}
