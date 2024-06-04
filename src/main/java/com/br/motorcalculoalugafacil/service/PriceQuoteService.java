package com.br.motorcalculoalugafacil.service;

import com.br.motorcalculoalugafacil.dto.payload.Comission;
import com.br.motorcalculoalugafacil.dto.payload.Discount;
import com.br.motorcalculoalugafacil.dto.payload.PriceQuote;
import com.br.motorcalculoalugafacil.dto.response.PriceQuoteOut;
import com.br.motorcalculoalugafacil.service.implementation.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PriceQuoteService {

    private final CarCalculatePriceImpl carCalculatePriceImpl = new CarCalculatePriceImpl();
    private final CarKmCalculatePriceImpl carKmCalculatePriceImpl = new CarKmCalculatePriceImpl();
    private final ExtraDriverCalculatePriceImpl extraDriverCalculatePriceImpl = new ExtraDriverCalculatePriceImpl();
    private final ComissionCalculatePriceImpl comissionCalculatePriceImpl = new ComissionCalculatePriceImpl();
    private final DiscountCalculatePriceImpl discountCalculatePriceImpl = new DiscountCalculatePriceImpl();
    private final FeesCalculatePriceImpl feesCalculatePriceImpl = new FeesCalculatePriceImpl();

    public PriceQuoteOut calculate(PriceQuote priceQuote) {
        CalculationManager calculationManager = new CalculationManager(carCalculatePriceImpl, carKmCalculatePriceImpl, extraDriverCalculatePriceImpl);
        return calculationManager.calculatePriceQuote(priceQuote);
    }

}
