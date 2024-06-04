package com.br.motorcalculoalugafacil.service.implementation;

import com.br.motorcalculoalugafacil.dto.payload.Comission;
import com.br.motorcalculoalugafacil.dto.response.ComissionOut;
import com.br.motorcalculoalugafacil.port.ComissionCalculatePrice;

import java.util.List;

public class ComissionCalculatePriceImpl implements ComissionCalculatePrice {

    @Override
    public List<ComissionOut> calculatePrice(List<Comission> comission) {
        return List.of();
    }
}
