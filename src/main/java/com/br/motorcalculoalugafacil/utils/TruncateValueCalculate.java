package com.br.motorcalculoalugafacil.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TruncateValueCalculate {
    public static double truncate(Double value) {
        BigDecimal newValue = new BigDecimal(value);
        return newValue.setScale(2, RoundingMode.DOWN).doubleValue();
    }
}
