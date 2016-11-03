package ch.sebooom.domain;

/**
 * Created by seb on 01.11.16.
 */
public interface Entity <T>{

    /**
     * Définis l'egalite au niveau de l'entite
     * @param t le type de l'entite a comparer
     * @return l'etat de la comparaison
     */
    public boolean sameEntityAs(T t);
}
