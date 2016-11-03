package ch.sebooom.domain.currency.model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;

/**
 * Created by seb on 18.09.16.
 */
public class CurrencyRate {

    private BigDecimal rate;
    private Currency referenceCurrency;
    private Currency rateCurrency;
    private LocalDate dateValidite;

    public CurrencyRate(BigDecimal rate, Currency referenceCurrency,Currency rateCurrency){
        if(null == rate){
            throw new NullPointerException("rate cannot be null");
        }
        this.rate = rate;
        this.rateCurrency = rateCurrency;
        this.referenceCurrency = referenceCurrency;
        this.dateValidite = LocalDate.now();

    }

    public Currency getRateCurrency() {
        return rateCurrency;
    }

    public Currency getReferenceCurrency() {
        return referenceCurrency;
    }

    public CurrencyRate(double rate, Currency referenceCurrency, Currency rateCurrency){

        //MathContext mc = new MathContext(2);

        this(new BigDecimal(rate).round(new MathContext(5)),referenceCurrency,rateCurrency);

    }

    @Override
    public String toString() {
        return "CurrencyRate{1 " + referenceCurrency.getSymbol() +" [" + referenceCurrency.getName() + "]"
                + " --> " + rate + " " + rateCurrency.getSymbol() +" [" + rateCurrency.getName() +"]"
                +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurrencyRate)) return false;

        CurrencyRate that = (CurrencyRate) o;

        return rate.equals(that.rate);

    }

    @Override
    public int hashCode() {
        return rate.hashCode();
    }
}
