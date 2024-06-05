package com.br.motorcalculoalugafacil.service.implementation;

import com.br.motorcalculoalugafacil.dto.payload.KmCar;
import com.br.motorcalculoalugafacil.dto.response.KmCarOut;
import com.br.motorcalculoalugafacil.port.CarKmCalculatePrice;

import static com.br.motorcalculoalugafacil.utils.TruncateValueCalculate.truncate;

public class CarKmCalculatePriceImpl implements CarKmCalculatePrice {

    @Override
    public KmCarOut calculatePrice(KmCar car) {
        if (car == null) {
            return null;
        }

        Double qtKm = car.qtKm().doubleValue();
        Double chargeEveryKm = car.chargeEveryKm().doubleValue();
        Double vlCalculate = (qtKm / chargeEveryKm) * car.vlKm();
        return new KmCarOut(car.qtKm(), car.vlKm(), car.chargeEveryKm(), truncate(vlCalculate));
    }
}
