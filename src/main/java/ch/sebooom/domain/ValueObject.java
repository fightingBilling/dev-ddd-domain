package ch.sebooom.domain;

/**
 * Created by seb on 01.11.16.
 */
public interface ValueObject<T> {

    /**
     * Définis l'egalite entre deux value object
     * @param t le type de la value object a comparer
     * @return l'etat de la comparaison
     */
    public boolean sameValueAs(T t);
}
