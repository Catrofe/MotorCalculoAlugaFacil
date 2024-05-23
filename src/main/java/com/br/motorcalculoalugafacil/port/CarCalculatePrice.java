package com.br.motorcalculoalugafacil.port;

import com.br.motorcalculoalugafacil.dto.payload.Car;
import com.br.motorcalculoalugafacil.dto.response.CarOut;

public interface CarCalculatePrice {

    CarOut calculatePrice(Car car);

}
