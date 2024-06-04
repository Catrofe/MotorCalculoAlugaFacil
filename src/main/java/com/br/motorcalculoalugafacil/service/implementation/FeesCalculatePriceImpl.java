package com.br.motorcalculoalugafacil.service.implementation;

import com.br.motorcalculoalugafacil.dto.payload.Fees;
import com.br.motorcalculoalugafacil.dto.response.FeesOut;
import com.br.motorcalculoalugafacil.port.FeesCalculatePrice;

import java.util.List;

public class FeesCalculatePriceImpl implements FeesCalculatePrice {
    @Override
    public List<FeesOut> calculatePrice(List<Fees> fees, Double price) {
        return fees.stream().map(fee -> calculateFees(fee, price)).toList();
    }

    private FeesOut calculateFees(Fees fees, Double price) {
        Double value = (price * (fees.pcFees() / 100)) + fees.vlFees();
        return new FeesOut(fees.nmFees(), fees.vlFees(), fees.pcFees(), value);
    }

}
