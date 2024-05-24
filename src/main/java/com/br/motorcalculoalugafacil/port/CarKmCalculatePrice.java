package com.br.motorcalculoalugafacil.port;

import com.br.motorcalculoalugafacil.dto.payload.KmCar;
import com.br.motorcalculoalugafacil.dto.response.KmCarOut;

public interface CarKmCalculatePrice {

    KmCarOut calculatePrice(KmCar car);

}
