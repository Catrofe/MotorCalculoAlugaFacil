package com.br.motorcalculoalugafacil.service;

import com.br.motorcalculoalugafacil.dto.payload.ExtraDriver;
import com.br.motorcalculoalugafacil.dto.response.ExtraDriverOut;
import com.br.motorcalculoalugafacil.port.ExtraDriverCalculatePrice;

public class ExtraDriverCalculatePriceImpl implements ExtraDriverCalculatePrice {

    @Override
    public ExtraDriverOut calculatePrice(ExtraDriver extraDriver) {
        if (extraDriver == null) {
            return null;
        }
        return new ExtraDriverOut(extraDriver.qtExtraDriver(), extraDriver.vlExtraDriverPerDay(), extraDriver.qtExtraDriver() * extraDriver.vlExtraDriverPerDay());
    }

}
