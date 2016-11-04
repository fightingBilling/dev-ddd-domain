package ch.sebooom.domain.stockexchange.matierespremieres.model;

public class PrixException extends RuntimeException {



	public PrixException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public PrixException(String message) {
		super(message);
	}



	
}
