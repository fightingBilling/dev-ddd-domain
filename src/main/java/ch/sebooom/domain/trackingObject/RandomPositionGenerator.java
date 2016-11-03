package ch.sebooom.domain.trackingObject;

import java.util.Date;



public class RandomPositionGenerator {

	private Position lastPosition;
    private int compteurOperateur = 0;
    private char operateur = '+';

    public static final int MIN_LONG = 1;
    public static final int MAX_LONG = 10;
    public static final int MIN_LAT = 40;
    public static final int MAX_LAT = 50;

    public Position position() {
       return lastPosition;
    }

    enum TypeValeur{
        LATITUDE, LONGITUDE;
    };
	
	/**
	 * Constructeur prenant en paramétre le premier point GPS à générer.
	 * @param startPosition
	 */
	public RandomPositionGenerator(Position startPosition){
		lastPosition = startPosition;
	}
	
	/**
	 * Retourne la prochaine position basé sur la dernière générée.
	 * Incrément ou décrémente de 1° maximum la latitude et le longitude:
	 * @return la prochaine position
	 */
	public void next() {
		
		double latitude = moveCoordinateValue(lastPosition.lat());
		double longitude = moveCoordinateValue(lastPosition.lng());


		this.lastPosition = new Position(latitude, longitude, new Date());

	}

	private double moveCoordinateValue (double initPosition) {

        if(compteurOperateur < 10){
            compteurOperateur++;
        }else{
            compteurOperateur = 0;
            if(operateur == '+'){
                operateur = '-';
            }else{
                operateur = '+';
            }
        }

        if(operateur == '+'){
            return additione(initPosition);
        }else{
            return soustrait(initPosition);
        }
	}

    public static Position generateSample(){

        return new Position(randomLatitude(),randomLongitude(),new Date());

    }

    public static double randomLongitude() {

        return randomValueFor(TypeValeur.LONGITUDE);
    }

    public static double randomLatitude() {

        return randomValueFor(TypeValeur.LATITUDE);
    }

    private static double randomValueFor(TypeValeur type) {

        double valMax = 0;
        double valMin = 0;

        switch(type){

            case LATITUDE:
                valMax = MAX_LAT;
                valMin = MIN_LAT;
                break;

            case LONGITUDE:
                valMax = MAX_LONG;
                valMin = MIN_LONG;
                break;
        }

        double valeur = 0;

        while(valeur < valMin || valeur > valMax){
            valeur = Math.random() * valMax;
        }
        return valeur;
    }

    private double additione (double valeur) {
        return valeur + Math.random();
    }

    private double soustrait (double valeur) {
        return valeur - Math.random();
    }
}
