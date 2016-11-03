package ch.sebooom.domain.stockexchange;

import ch.sebooom.domain.stockexchange.prix.Prix;

public abstract class StockExchangeEntity {


	/**
	 * Retourne le prix de l'entite
	 * @return
     */
	public abstract Prix prix();

	/**
	 * Mise à jour du prix de l'entite
	 * @param prix le prix de l'entite a mettre a jour
     */
	public abstract void updatePrix(double prix);
}
