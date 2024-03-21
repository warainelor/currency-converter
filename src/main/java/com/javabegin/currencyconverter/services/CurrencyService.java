package com.javabegin.currencyconverter.services;

import com.javabegin.currencyconverter.repository.CurrencyRepository;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    private CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public String getCurrencyString() {
        return currencyRepository.findAllCurrencies().get(0);
    }
}
