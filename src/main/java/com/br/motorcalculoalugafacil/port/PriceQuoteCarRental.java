package com.br.motorcalculoalugafacil.port;

import com.br.motorcalculoalugafacil.dto.payload.PriceQuote;
import com.br.motorcalculoalugafacil.dto.response.PriceQuoteOut;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PriceQuoteCarRental {

    @PostMapping("/price-quote")
    ResponseEntity<PriceQuoteOut> priceQuote(@RequestBody @Valid PriceQuote priceQuote);
}
