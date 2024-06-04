package com.br.motorcalculoalugafacil.port;

import com.br.motorcalculoalugafacil.dto.payload.Comission;
import com.br.motorcalculoalugafacil.dto.response.ComissionOut;

import java.util.List;

public interface ComissionCalculatePrice {

    List<ComissionOut> calculatePrice(List<Comission> comission);

}
