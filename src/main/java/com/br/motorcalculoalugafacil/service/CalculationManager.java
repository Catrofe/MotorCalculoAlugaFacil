package com.br.motorcalculoalugafacil.service;

import com.br.motorcalculoalugafacil.dto.payload.PriceQuote;
import com.br.motorcalculoalugafacil.dto.response.CarOut;
import com.br.motorcalculoalugafacil.dto.response.ExtraDriverOut;
import com.br.motorcalculoalugafacil.dto.response.KmCarOut;
import com.br.motorcalculoalugafacil.dto.response.PriceQuoteOut;
import com.br.motorcalculoalugafacil.port.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class CalculationManager {

    private CarCalculatePrice carCalculatePrice;
    private CarKmCalculatePrice carKmCalculatePrice;
    private ExtraDriverCalculatePrice extraDriverCalculatePrice;
    private ComissionCalculatePrice comissionCalculatePrice;
    private FeesCalculatePrice feesCalculatePrice;
    private DiscountCalculatePrice discountCalculatePrice;


    public PriceQuoteOut calculatePriceQuote(PriceQuote priceQuote) {
        CarOut carOut = carCalculatePrice.calculatePrice(priceQuote.mpCar());
        KmCarOut kmCarOut = carKmCalculatePrice.calculatePrice(priceQuote.mpKmCar());
        ExtraDriverOut extraDriverOut = extraDriverCalculatePrice.calculatePrice(priceQuote.mpExtraDriver());
        Double totalPrice = calculateTotalPrice(carOut, kmCarOut, extraDriverOut);
        return new PriceQuoteOut(
                null,
                null,
                null,
                extraDriverOut,
                kmCarOut,
                carOut,
                totalPrice

        );
    }

    private Double calculateTotalPrice(CarOut carOut, KmCarOut kmCarOut, ExtraDriverOut extraDriverOut) {
        Double totalPrice = 0.0;
        if (carOut != null) {
            totalPrice += carOut.vlCalculate();
        }
        if (kmCarOut != null) {
            totalPrice += kmCarOut.vlCalculate();
        }
        if (extraDriverOut != null) {
            totalPrice += extraDriverOut.vlCalculate();
        }
        return totalPrice;
    }

}
