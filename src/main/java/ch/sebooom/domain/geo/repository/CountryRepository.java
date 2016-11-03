package ch.sebooom.domain.geo.repository;

import ch.sebooom.domain.geo.model.Country;

import java.util.List;

/**
 * Created by seb on 18.09.16.
 */
public interface CountryRepository {

    public List<Country> findAll();

    public Country findById(String id);

    public Country findByIsoCode(String isoCode);

    public Country findByName(String name);


}
