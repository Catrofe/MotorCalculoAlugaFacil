package com.br.motorcalculoalugafacil.service;

import com.br.motorcalculoalugafacil.dto.payload.PriceQuote;
import com.br.motorcalculoalugafacil.dto.response.CarOut;
import com.br.motorcalculoalugafacil.dto.response.PriceQuoteOut;
import com.br.motorcalculoalugafacil.port.CarCalculatePrice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CalculationManager {

    private CarCalculatePrice carCalculatePrice;


    public PriceQuoteOut calculatePriceQuote(PriceQuote priceQuote) {
        CarOut carOut = carCalculatePrice.calculatePrice(priceQuote.mpCar());
        Double totalPrice = calculateTotalPrice(List.of(carOut.vlCalculate()));
        return new PriceQuoteOut(
                null,
                null,
                null,
                null,
                carOut,
                totalPrice

        );
    }

    private Double calculateTotalPrice(List<Double> prices) {
        return prices.stream().reduce(0.0, Double::sum);
    }
}
