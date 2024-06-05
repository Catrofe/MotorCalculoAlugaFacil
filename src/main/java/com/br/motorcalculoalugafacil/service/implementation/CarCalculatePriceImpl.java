package com.br.motorcalculoalugafacil.service.implementation;

import com.br.motorcalculoalugafacil.dto.payload.Car;
import com.br.motorcalculoalugafacil.dto.response.CarOut;
import com.br.motorcalculoalugafacil.port.CarCalculatePrice;

import static com.br.motorcalculoalugafacil.utils.TruncateValueCalculate.truncate;

public class CarCalculatePriceImpl implements CarCalculatePrice {

    @Override
    public CarOut calculatePrice(Car car) {
        Double vlCalculateCarPerDay = car.vlCarPerDay() * car.qtCarDaysUse();
        return new CarOut(car.nmCar(), car.vlCarPerDay(), car.qtCarDaysUse(), truncate(vlCalculateCarPerDay));
    }

}
