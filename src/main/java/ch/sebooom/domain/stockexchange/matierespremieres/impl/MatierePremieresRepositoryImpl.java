package ch.sebooom.domain.stockexchange.matierespremieres.impl;

import java.util.List;

import ch.sebooom.domain.simulator.StockExchangeEntity;
import ch.sebooom.domain.stockexchange.matierespremieres.impl.memorydatastore.MatierePremiereDatas;
import ch.sebooom.domain.stockexchange.matierespremieres.model.MatierePremiere;
import ch.sebooom.domain.stockexchange.matierespremieres.repository.MatierePremieresRepository;

public class MatierePremieresRepositoryImpl implements MatierePremieresRepository{

	@Override
	public List<StockExchangeEntity> getAllMatieresPremieres() {
		return MatierePremiereDatas.datas();
	}

	@Override
	public StockExchangeEntity findByName(String matierePremiereName) {
		
		for(StockExchangeEntity mat : MatierePremiereDatas.datas()){
			MatierePremiere mp = (MatierePremiere)mat;
			
			if(mp.nom().equals(matierePremiereName)){
				return mat;
			}
		}
		
		throw new NullPointerException("Entity with name: " + matierePremiereName + " doesn't exist in memory data store");
		
	}

}
