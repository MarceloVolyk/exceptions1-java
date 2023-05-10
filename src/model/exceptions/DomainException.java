package model.exceptions;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;    //essas coisas locas vamos ver mais pra frente

	public DomainException(String msg) {
		super(msg);
	}
	
}
