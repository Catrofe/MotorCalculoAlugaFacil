package com.br.motorcalculoalugafacil.service.implementation;

import com.br.motorcalculoalugafacil.dto.payload.ExtraDriver;
import com.br.motorcalculoalugafacil.dto.response.ExtraDriverOut;
import com.br.motorcalculoalugafacil.port.ExtraDriverCalculatePrice;

import static com.br.motorcalculoalugafacil.utils.TruncateValueCalculate.truncate;

public class ExtraDriverCalculatePriceImpl implements ExtraDriverCalculatePrice {

    @Override
    public ExtraDriverOut calculatePrice(ExtraDriver extraDriver) {
        if (extraDriver == null) {
            return null;
        }
        return new ExtraDriverOut(extraDriver.qtExtraDriver(), extraDriver.vlExtraDriverPerDay(), truncate(calculateTotalPrice(extraDriver)));
    }

    private static double calculateTotalPrice(ExtraDriver extraDriver) {
        return extraDriver.qtExtraDriver() * extraDriver.vlExtraDriverPerDay();
    }

}
