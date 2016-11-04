package ch.sebooom.domain.stockexchange.matierespremieres.model;

public enum Operation {

	ADD("+"),SUBSTRACT("-");
	
	public String signe;
	
	Operation(String signe){
		this.signe = signe;
	};
	
	
}
