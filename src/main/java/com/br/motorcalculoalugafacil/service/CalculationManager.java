package com.br.motorcalculoalugafacil.service;

import com.br.motorcalculoalugafacil.dto.payload.PriceQuote;
import com.br.motorcalculoalugafacil.dto.response.CarOut;
import com.br.motorcalculoalugafacil.dto.response.KmCarOut;
import com.br.motorcalculoalugafacil.dto.response.PriceQuoteOut;
import com.br.motorcalculoalugafacil.port.CarCalculatePrice;
import com.br.motorcalculoalugafacil.port.CarKmCalculatePrice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CalculationManager {

    private CarCalculatePrice carCalculatePrice;
    private CarKmCalculatePrice carKmCalculatePrice;


    public PriceQuoteOut calculatePriceQuote(PriceQuote priceQuote) {
        CarOut carOut = carCalculatePrice.calculatePrice(priceQuote.mpCar());
        KmCarOut kmCarOut = carKmCalculatePrice.calculatePrice(priceQuote.mpKmCar());
        Double totalPrice = calculateTotalPrice(carOut, kmCarOut);
        return new PriceQuoteOut(
                null,
                null,
                null,
                null,
                kmCarOut,
                carOut,
                totalPrice

        );
    }

    private Double calculateTotalPrice(CarOut carOut, KmCarOut kmCarOut) {
        Double totalPrice = 0.0;
        if (carOut != null) {
            totalPrice += carOut.vlCalculate();
        }
        if (kmCarOut != null) {
            totalPrice += kmCarOut.vlCalculate();
        }
        return totalPrice;
    }

}
