package ch.sebooom.domain.cotation.model;

import com.google.common.base.Preconditions;

/**
 * Modélisation d'un indice boursier
 * Un indice boursier est défini par:
 * <li>son nom</li>
 * <li>son cours</li>
 * @see Cours
 *
 */
public class Indice {

	private String nom;
	private Cours cours;

	/**
	 * Constructeur statique.
	 * @param nom le nom de l'indice, not null
	 * @param cours le cours de l'indice, not null
	 * @throws NullPointerException si nom ou indice null
     * @return une instance de <code>Indice</code>
     */
	public static Indice from(String nom, Cours cours) {
		Preconditions.checkNotNull(nom);
		Preconditions.checkNotNull(cours);
		return new Indice(nom,cours);
	}

	private Indice(String nom, Cours cours){
		this.nom = nom;
		this.cours = cours;
	}

	/**
	 * Retourne le cours de l'indice
	 * @return le cours de l'indice
     */
	public Cours cours() {
		return cours;
	}

	/**
	 * Retourne le nom de l'indice
	 * @return le nom de l'indice
     */
	public String nom() {
		return nom;
	}


	
	
}
