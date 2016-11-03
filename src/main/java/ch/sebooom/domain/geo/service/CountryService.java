package ch.sebooom.domain.geo.service;

import ch.sebooom.domain.currency.model.ISOCode;
import ch.sebooom.domain.geo.model.Country;

import java.util.List;

/**
 * Created by seb on 18.09.16.
 */
public interface CountryService {

    public List<Country> findAllCountry();

    public Country findByIsoCode(ISOCode isoCode);
}
