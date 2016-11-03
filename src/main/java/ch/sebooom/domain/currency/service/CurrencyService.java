package ch.sebooom.domain.currency.service;

import ch.sebooom.domain.currency.model.Currency;

import java.util.List;

/**
 * Created by seb on 18.09.16.
 */
public interface CurrencyService {

    public List<Currency> findAll();

    public Currency findById(String id);

    public Currency findByIsoCode(String isoCode);
}
