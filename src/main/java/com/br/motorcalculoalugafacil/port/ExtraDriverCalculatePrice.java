package com.br.motorcalculoalugafacil.port;

import com.br.motorcalculoalugafacil.dto.payload.ExtraDriver;
import com.br.motorcalculoalugafacil.dto.response.ExtraDriverOut;

public interface ExtraDriverCalculatePrice {

    ExtraDriverOut calculatePrice(ExtraDriver extraDriver);

}
