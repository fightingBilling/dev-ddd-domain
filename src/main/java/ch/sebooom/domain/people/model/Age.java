package ch.sebooom.domain.people.model;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by seb on 28.09.16.
 */
public class Age {

    private int annee;
    private int mois;
    private int jour;


    public Age(LocalDate dateNaissance){

        Period age = Period.between(dateNaissance,LocalDate.now());
        this.annee  =age.getYears();
        this.jour = age.getDays();
        this.mois = age.getMonths();
    }

    public int annee() {
        return annee;
    }

    public int jour() {
        return jour;
    }

    public int mois() {
        return mois;
    }
}
