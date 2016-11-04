package ch.sebooom.domain.stockexchange.matierespremieres.impl;

import java.util.List;

import ch.sebooom.domain.stockexchange.matierespremieres.impl.memorydatastore.MatierePremiereDatas;
import ch.sebooom.domain.stockexchange.matierespremieres.model.MatierePremiere;
import ch.sebooom.domain.stockexchange.matierespremieres.repository.MatierePremieresRepository;

public class MatierePremieresRepositoryImpl implements MatierePremieresRepository{

	@Override
	public List<MatierePremiere> getAllMatieresPremieres() {
		return MatierePremiereDatas.datas();
	}

	@Override
	public MatierePremiere findByName(String matierePremiereName) {
		
		for(MatierePremiere mat : MatierePremiereDatas.datas()){
			if(mat.nom().equals(matierePremiereName)){
				return mat;
			}
		}
		
		throw new NullPointerException("Entity with name: " + matierePremiereName + " doesn't exist in memory data store");
		
	}

}
