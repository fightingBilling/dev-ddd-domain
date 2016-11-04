package ch.sebooom.domain.stockexchange.matierespremieres.service;

import java.util.List;

import ch.sebooom.domain.stockexchange.matierespremieres.model.MatierePremiere;

public interface MatierePremiereService {

 public List<MatierePremiere> getAllMatieresPremieres();
	 
	 public MatierePremiere findByName(String matierePremiereName);
}
