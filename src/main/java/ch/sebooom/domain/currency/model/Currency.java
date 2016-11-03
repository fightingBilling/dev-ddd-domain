package ch.sebooom.domain.currency.model;

import com.google.common.base.Preconditions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Created by seb on 18.09.16.
 */
public class Currency {
    public String getId() {
        return id;
    }

    private final String name;
    private final ISOCode isoCode;
    private final String symbol;
    private final String id;
    private List<CurrencyRate> currencyRateList = new ArrayList<CurrencyRate>();


    public Currency(ISOCode isoCode, String name, String symbol) {

        Preconditions.checkNotNull(isoCode);
        Preconditions.checkNotNull(name);
        Preconditions.checkNotNull(symbol);


        this.isoCode = isoCode;
        this.name = name;
        this.symbol = symbol;
        this.id = UUID.randomUUID().toString();
    }

    public void addCurencyRate(CurrencyRate currencyRate){
        Preconditions.checkNotNull(currencyRate);
        this.currencyRateList.add(currencyRate);
    }

    public void addCurencyRates(List<CurrencyRate> currencyRates){
        Preconditions.checkNotNull(currencyRates);
        this.currencyRateList = new ArrayList<CurrencyRate>(currencyRates);
    }

    public List<CurrencyRate> getCurrencyRates(){
        return Collections.unmodifiableList(this.currencyRateList);
    }

    public ISOCode getIsoCode() {
        return isoCode;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
