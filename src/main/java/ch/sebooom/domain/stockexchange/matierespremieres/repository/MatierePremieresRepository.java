package ch.sebooom.domain.stockexchange.matierespremieres.repository;

import java.util.List;

import ch.sebooom.domain.simulator.StockExchangeEntity;
import ch.sebooom.domain.stockexchange.matierespremieres.model.MatierePremiere;

public interface MatierePremieresRepository {

	 public List<StockExchangeEntity> getAllMatieresPremieres();
	 
	 public StockExchangeEntity findByName(String matierePremiereName);
	 
	 
}
