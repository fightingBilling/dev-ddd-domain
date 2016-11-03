package ch.sebooom.domain.people.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

/**
 * Created by seb on 28.09.16.
 */
public class Personne {

    private LocalDate dateNaissance;
    private String prenom;
    private String nom;
    private Sexe sexe;


    public Personne(LocalDate dateNaissance, String nom, String prenom, Sexe sexe) {
        this.dateNaissance = dateNaissance;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;

        
    }

    public Personne(LocalDate dateNaissance,String prenom,Sexe sexe ) {
        this.sexe = sexe;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public String nom() {
        return nom;
    }

    public String prenom() {
        return prenom;
    }

    public Sexe sexe() {
        return sexe;
    }

    public int age () {
        return Period.between(dateNaissance,LocalDate.now()).getYears();
    }

    public static List<Personne> getPersonnes () {

        return Arrays.asList(
                new Personne(LocalDate.of(1925,12,3),"Chirac","Patrick",Sexe.HOMME),
                new Personne(LocalDate.of(1992,3,22),"Bond","James",Sexe.HOMME),
                new Personne(LocalDate.of(1956,2,2),"Poulain","Amélie",Sexe.FEMME),
                new Personne(LocalDate.of(1921,12,11),"Charlot",Sexe.HOMME),
                new Personne(LocalDate.of(1990,1,1),"Vador","Dark",Sexe.HOMME),
                new Personne(LocalDate.of(1975,4,5),"Nikita",Sexe.FEMME),
                new Personne(LocalDate.of(1951,1,25),"Popins","Mary",Sexe.FEMME),
                new Personne(LocalDate.of(1971,12,25),"Kramer","Catherine",Sexe.FEMME));

    }

    public boolean isFromSexe(Sexe sexe){
        return this.sexe == sexe;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "dateNaissance=" + dateNaissance +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", sexe=" + sexe +
                '}';
    }
}
