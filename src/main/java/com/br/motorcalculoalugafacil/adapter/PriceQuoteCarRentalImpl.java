package com.br.motorcalculoalugafacil.adapter;

import com.br.motorcalculoalugafacil.dto.payload.PriceQuote;
import com.br.motorcalculoalugafacil.port.PriceQuoteCarRental;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/avaliations")
@AllArgsConstructor
public class PriceQuoteCarRentalImpl implements PriceQuoteCarRental {

    @Override
    public ResponseEntity<?> priceQuote(@RequestBody @Valid PriceQuote priceQuote) {
        return ResponseEntity.ok().build();
    }

}
