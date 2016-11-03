package ch.sebooom.domain.currency.repository;

import ch.sebooom.domain.currency.model.Currency;
import ch.sebooom.domain.currency.model.CurrencyRate;

import java.util.List;

/**
 * Created by seb on 18.09.16.
 */
public interface CurrencyRateRepository {

    public List<CurrencyRate> findForRefCurrency(Currency currency);


}
