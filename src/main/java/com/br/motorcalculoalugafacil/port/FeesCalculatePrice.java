package com.br.motorcalculoalugafacil.port;

import com.br.motorcalculoalugafacil.dto.payload.Fees;
import com.br.motorcalculoalugafacil.dto.response.FeesOut;

import java.util.List;

public interface FeesCalculatePrice {

    List<FeesOut> calculatePrice(List<Fees> fees, Double price);

}
