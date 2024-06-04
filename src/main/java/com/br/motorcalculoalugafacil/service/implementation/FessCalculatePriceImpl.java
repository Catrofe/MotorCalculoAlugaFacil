package com.br.motorcalculoalugafacil.service.implementation;

import com.br.motorcalculoalugafacil.dto.payload.Fees;
import com.br.motorcalculoalugafacil.dto.response.FeesOut;
import com.br.motorcalculoalugafacil.port.FessCalculatePrice;

import java.util.List;

public class FessCalculatePriceImpl implements FessCalculatePrice {
    @Override
    public List<FeesOut> calculatePrice(List<Fees> fees) {
        return List.of();
    }
}
