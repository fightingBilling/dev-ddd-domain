package ch.sebooom.domain.stockexchange.prix;

public enum Operation {

	ADD("+"),SUBSTRACT("-");
	
	public String signe;
	
	Operation(String signe){
		this.signe = signe;
	};
	
	
}
