package com.br.motorcalculoalugafacil.service;

import com.br.motorcalculoalugafacil.dto.payload.PriceQuote;
import com.br.motorcalculoalugafacil.dto.response.*;
import com.br.motorcalculoalugafacil.port.*;
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
    private ExtraDriverCalculatePrice extraDriverCalculatePrice;
    private ComissionCalculatePrice comissionCalculatePrice;
    private FeesCalculatePrice feesCalculatePrice;
    private DiscountCalculatePrice discountCalculatePrice;


    public PriceQuoteOut calculatePriceQuote(PriceQuote priceQuote) {
        CarOut carOut = carCalculatePrice.calculatePrice(priceQuote.mpCar());
        KmCarOut kmCarOut = carKmCalculatePrice.calculatePrice(priceQuote.mpKmCar());
        ExtraDriverOut extraDriverOut = extraDriverCalculatePrice.calculatePrice(priceQuote.mpExtraDriver());
        Double totalPriceRaw = calculateTotalPriceRaw(carOut, kmCarOut, extraDriverOut);
        List<ComissionOut> comissionOuts = comissionCalculatePrice.calculatePrice(priceQuote.lsComission(), totalPriceRaw);
        List<FeesOut> feesOuts = feesCalculatePrice.calculatePrice(priceQuote.lsFees(), totalPriceRaw);
        Double totalPriceWithoutDiscount = calculatePriceWithoutDescount(totalPriceRaw, feesOuts, comissionOuts);
        List<DiscountOut> discountOuts = discountCalculatePrice.calculatePrice(priceQuote.lsDiscount(), totalPriceWithoutDiscount);
        Double totalPrice = calculatePriceFinal(totalPriceWithoutDiscount, discountOuts);
        return new PriceQuoteOut(
                feesOuts,
                comissionOuts,
                discountOuts,
                extraDriverOut,
                kmCarOut,
                carOut,
                totalPrice
        );
    }

    private Double calculateTotalPriceRaw(CarOut carOut, KmCarOut kmCarOut, ExtraDriverOut extraDriverOut) {
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

    private Double calculatePriceWithoutDescount(Double totalPriceRaw, List<FeesOut> feesOuts, List<ComissionOut> comissionOuts) {
        Double totalPrice = totalPriceRaw;
        for (FeesOut feesOut : feesOuts) {
            totalPrice += feesOut.vlCalculate();
        }
        for (ComissionOut comissionOut : comissionOuts) {
            totalPrice += comissionOut.vlCalculate();
        }
        return totalPrice;
    }

    private Double calculatePriceFinal(Double totalPriceWithoutDiscount, List<DiscountOut> discountOuts) {
        Double totalPrice = totalPriceWithoutDiscount;
        for (DiscountOut discountOut : discountOuts) {
            totalPrice -= discountOut.vlCalculate();
        }
        return totalPrice;
    }
}
