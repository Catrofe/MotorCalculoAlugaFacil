package com.br.motorcalculoalugafacil.service.implementation;

import com.br.motorcalculoalugafacil.dto.payload.Comission;
import com.br.motorcalculoalugafacil.dto.response.ComissionOut;
import com.br.motorcalculoalugafacil.port.ComissionCalculatePrice;

import java.util.List;
import java.util.stream.Collectors;

public class ComissionCalculatePriceImpl implements ComissionCalculatePrice {

    @Override
    public List<ComissionOut> calculatePrice(List<Comission> comissions, Double price) {
        if (comissions == null || comissions.isEmpty()) {
            return List.of();
        }
        return comissions.stream()
                .map(comission -> calculateComission(comission, price))
                .collect(Collectors.toList());
    }

    private ComissionOut calculateComission(Comission comission, Double price) {
        Double vlComissionValue = (price * (comission.pcComission() / 100)) + comission.vlComission();
        return new ComissionOut(comission.nmComission(), comission.vlComission(), comission.pcComission(), vlComissionValue);
    }
}
