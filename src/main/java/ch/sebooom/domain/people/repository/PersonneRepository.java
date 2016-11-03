package ch.sebooom.domain.people.repository;

import ch.sebooom.domain.people.model.Personne;

import java.util.List;

/**
 * Created by seb on 28.09.16.
 */
public interface PersonneRepository {

    public List<Personne> getAllSamplePersonnes();
}
