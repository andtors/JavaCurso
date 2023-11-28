package model.exceptions;

public class DomainException extends RuntimeException{
	//Se colocarmos RunTimeException o programa finaliza e quebra e não mostra nosso texto personalizado e não precisamos colocar throws
	private static final long serialVersionUID = 1L;
	public DomainException(String msg) {
		/*Criamos o String msg por que é a variavel onde será salvo o resultado da nossa logica lá no metodo do reservation (updateDate)
		 * se não colocamos o dentro do super irá aparecer null*/
		super(msg);
	}
}
