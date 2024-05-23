package com.br.motorcalculoalugafacil.service;

import com.br.motorcalculoalugafacil.dto.payload.Car;
import com.br.motorcalculoalugafacil.dto.response.CarOut;
import com.br.motorcalculoalugafacil.port.CarCalculatePrice;

public class CarCalculatePriceImpl implements CarCalculatePrice {

    @Override
    public CarOut calculatePrice(Car car) {
        Double vlCalculateCarPerDay = car.vlCarPerDay() * car.qtCarDaysUse();
        return new CarOut(car.nmCar(), car.vlCarPerDay(), car.qtCarDaysUse(), vlCalculateCarPerDay);
    }
}
