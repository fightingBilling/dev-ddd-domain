package ch.sebooom.domain.geo.model;

import ch.sebooom.domain.currency.model.Currency;
import ch.sebooom.domain.currency.model.ISOCode;
import com.google.common.base.Preconditions;

import java.util.UUID;

/**
 * Created by seb on 18.09.16.
 */
public class Country {

    private final String id;
    private final Currency currency;
    private final ISOCode isoCode;
    private final String name;
    private final Integer population;

    public Country(Currency currency, ISOCode isoCode, String name, Integer population) {
        Preconditions.checkNotNull(currency);
        Preconditions.checkNotNull(isoCode);
        Preconditions.checkNotNull(name);
        Preconditions.checkNotNull(population);

        this.id = UUID.randomUUID().toString();
        this.currency = currency;
        this.isoCode = isoCode;
        this.name = name;
        this.population = population;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getId() {
        return id;
    }

    public ISOCode getIsoCode() {
        return isoCode;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }
}
