package ch.sebooom.domain.cotation.model;

import com.google.common.base.Preconditions;

import java.util.Random;

/**
 * Created by seb on 11.10.16.
 */
public class IndiceAleatoire {

    public static Indice fromNextCoursAleatoire(Indice indice){
        Preconditions.checkNotNull(indice);

        double lastValue = indice.cours().valeurCours().doubleValue();

        return Indice.from(indice.nom(),Cours.from(valeurAleatoire(lastValue)));

    }

    private static double valeurAleatoire (double valeurOrigine) {

        Random randomGenerator = new Random();
        //pourcentage aléatoire
        int pourcent = randomGenerator.nextInt(100)+1;
        //boolean définissant si on monte ou descend la valeur next
        boolean valeurUp = randomGenerator.nextBoolean();

        double nextValeur;

        if(valeurUp){
            nextValeur = valeurOrigine * pourcent + valeurOrigine;
        }else{
            nextValeur = valeurOrigine - valeurOrigine * pourcent;
        }

        return nextValeur;
    }

}
