package ch.sebooom.domain.stockexchange.matierespremieres.impl;

import java.util.List;

import ch.sebooom.domain.simulator.StockExchangeEntity;
import ch.sebooom.domain.stockexchange.matierespremieres.model.MatierePremiere;
import ch.sebooom.domain.stockexchange.matierespremieres.repository.MatierePremieresRepository;
import ch.sebooom.domain.stockexchange.matierespremieres.service.MatierePremiereService;

public class MatierePremieresServiceImpl implements MatierePremiereService{

	MatierePremieresRepository repository;
	
	public MatierePremieresServiceImpl(MatierePremieresRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<StockExchangeEntity> getAllMatieresPremieres() {
		return repository.getAllMatieresPremieres();
	}

	@Override
	public StockExchangeEntity findByName(String matierePremiereName) {
		return repository.findByName(matierePremiereName);
	}

}
