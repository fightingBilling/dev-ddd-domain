package ch.sebooom.domain.cotation.repository;

import ch.sebooom.domain.cotation.model.Indice;

import java.util.List;

/**
 * Created by seb on 11.10.16.
 */
public interface IndiceRepository {

    public List<Indice> getIndicesAsList();
}
