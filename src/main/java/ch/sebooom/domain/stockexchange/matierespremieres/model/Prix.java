package ch.sebooom.domain.stockexchange.matierespremieres.model;

import ch.sebooom.domain.ValueObject;
import ch.sebooom.domain.stockexchange.StockExchangeValue;
import com.google.common.base.MoreObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Modélisation d'un prix d'une valeur boursiere
 */
public class Prix extends StockExchangeValue implements ValueObject<Prix>{

	private LocalDateTime dateValeur;
	private BigDecimal valeur;
	public final static int BIG_DECIMAL_SCALE = 3;
	public final static RoundingMode ROUNDING_MODE = RoundingMode.UP;
	public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss A");

	/**
	 * Constructeur statique
	 * @param valeur la valeur du prix, not null
	 * @return
     */
	public static Prix from(double valeur){
		return new Prix(checkNotNull(valeur));
	}

	private Prix(double valeur){
		this.valeur = BigDecimal.valueOf(valeur).setScale(BIG_DECIMAL_SCALE, ROUNDING_MODE);
		this.dateValeur = LocalDateTime.now();
	}

	/**
	 *
	 * @return la date de la valeur
     */
	public LocalDateTime dateValeur() {
		return dateValeur;
	}

	/**
	 *
	 * @return la valeur, le prix
     */
	public BigDecimal valeur() {
		return valeur;
	}


	@Override
	public String toString() {


		return MoreObjects
				.toStringHelper(this)
				.addValue(dateValeur.format(formatter))
				.addValue(valeur)
				.toString();
	}



	public boolean sameValueAs(Prix o) {
		if (this == o) return true;
		if (!(o instanceof Prix)) return false;

		Prix prix =  o;

		if (!dateValeur.equals(prix.dateValeur)) return false;
		return valeur.equals(prix.valeur);
	}
}
