package ch.sebooom.domain.stockexchange.matierespremieres.repository;

import java.util.List;


import ch.sebooom.domain.stockexchange.matierespremieres.model.MatierePremiere;

public interface MatierePremieresRepository {

	 public List<MatierePremiere> getAllMatieresPremieres();
	 
	 public MatierePremiere findByName(String matierePremiereName);
	 
	 
}
