package com.br.motorcalculoalugafacil.adapter;

import com.br.motorcalculoalugafacil.dto.payload.PriceQuote;
import com.br.motorcalculoalugafacil.dto.response.PriceQuoteOut;
import com.br.motorcalculoalugafacil.port.PriceQuoteCarRental;
import com.br.motorcalculoalugafacil.service.PriceQuoteService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motor")
@AllArgsConstructor
public class PriceQuoteCarRentalImpl implements PriceQuoteCarRental {

    private PriceQuoteService service;

    @Override
    public ResponseEntity<PriceQuoteOut> priceQuote(@RequestBody @Valid PriceQuote priceQuote) {
        PriceQuoteOut calculation = service.calculate(priceQuote);
        return ResponseEntity.ok(calculation);
    }

}
