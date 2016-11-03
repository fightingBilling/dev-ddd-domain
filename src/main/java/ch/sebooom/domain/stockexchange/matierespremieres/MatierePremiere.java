package ch.sebooom.domain.stockexchange.matierespremieres;
import ch.sebooom.domain.Entity;
import ch.sebooom.domain.stockexchange.StockExchangeEntity;
import ch.sebooom.domain.stockexchange.prix.Prix;
import com.google.common.base.MoreObjects;
import static com.google.common.base.Preconditions.*;


/**
 * Modélisation d'une valeur boursiere de type Matiere Premiere
 */
public class MatierePremiere extends StockExchangeEntity implements Entity<MatierePremiere>{

	private String nom;
	private String description;
	private Prix prix;

	/**
	 *
	 * @param nom le nom de la matiere premiere, not null
	 * @param desc la description de la matiere premiere, not null
	 * @param prixInitial le prix initial lors de l'instanciation, not null
     */
	public MatierePremiere(String nom, String desc, Prix prixInitial) {
		this.nom = checkNotNull(nom, new MatierePremiereException("Name can't be null"));
		this.description = checkNotNull(desc, new MatierePremiereException("Desc can't be null"));
		this.prix = checkNotNull(prixInitial, new MatierePremiereException("PrixInitial can't be null"));
	}

	/**
	 *
	 * @return le nom de la matiere premiere
     */
	public String nom() {
		return nom;
	}

	/**
	 *
	 * @return la description de la matiere premiere
     */
	public String description() {
		return description;
	}
	
	@Override
	public Prix prix(){
		return prix;
	}

	@Override
	public void updatePrix(double prix){
		checkNotNull(prix, new MatierePremiereException("Prix can't be null"));
		checkState(prix > 0.0d);

		this.prix = Prix.from(prix);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.addValue(prix)
				.addValue(nom)
				.addValue(description)
				.toString();
	}


	public boolean sameEntityAs(MatierePremiere matierePremiere) {
		return matierePremiere != null && matierePremiere.nom().equals(this.nom);
	}


}
