package ch.sebooom.domain.cotation.model;

import com.google.common.base.Preconditions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

/**
 * Modélisation d'un cours de la bourse
 * Un cours de la bourse est défini par:
 * <li>sa date de valeur</li>
 * <li>la valeur de son cours</li>
 */
public class Cours {

	private static final int SCALE = 2;
	private static final RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;
	
	private LocalDateTime dateValeur;
	private BigDecimal valeurCours;

	/**
	 * Constructeur statique
	 * @param valeurCours la valeur du cours, not null
	 * @return une instance de <code>Cours</code>
     */
	public static Cours from(double valeurCours){
		Preconditions.checkNotNull(valeurCours);
		return new Cours(valeurCours);
	}

	/**
	 * Constructeur statique
	 * @param valeurCours la valeur du cours, not null
	 * @return une instance de <code>Cours</code>
	 */
	public static Cours from(BigDecimal valeurCours){
		Preconditions.checkNotNull(valeurCours);
		return new Cours(valeurCours);
	}

	private Cours(double valeurCours) {
		this.valeurCours = new BigDecimal(valeurCours).setScale(SCALE, ROUNDING_MODE);
		this.dateValeur = LocalDateTime.now();
	}
	
	private Cours(BigDecimal valeurCours) {
		this.valeurCours = valeurCours.setScale(SCALE, ROUNDING_MODE);
		this.dateValeur = LocalDateTime.now();
	}
	
	public LocalDateTime dateValeur() {
		return dateValeur;
	}
	
	public BigDecimal valeurCours() {
		return valeurCours;
	}


}
