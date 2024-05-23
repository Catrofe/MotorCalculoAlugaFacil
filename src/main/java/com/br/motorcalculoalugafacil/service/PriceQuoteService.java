package com.br.motorcalculoalugafacil.service;

import com.br.motorcalculoalugafacil.dto.payload.PriceQuote;
import com.br.motorcalculoalugafacil.dto.response.PriceQuoteOut;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PriceQuoteService {

    private final CarCalculatePriceImpl carCalculatePriceImpl = new CarCalculatePriceImpl();

    public PriceQuoteOut calculate(PriceQuote priceQuote) {
        CalculationManager calculationManager = new CalculationManager(carCalculatePriceImpl);
        return calculationManager.calculatePriceQuote(priceQuote);
    }

}
