import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.234252;
		
		
		System.out.printf("Olá Mundo!");
		/* println (Pula linha)
		 * printf (Não pula linha) */
		
		System.out.println (y);
		System.out.println (x);
		System.out.printf("%.2f%n", x);
		
		/* %.(Quantidade de casas depois da virgula)
		 * %.n Pular linha                         */
		Locale.setDefault(Locale.US);
		/* Trocar o ponto por virgula na hora de mostrar o número 
		 * Não esquecer do import automatico                    */
		
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " Metros");
		System.out.printf("RESULTADO =  %.2f metros%n", x);

		/*------------------------------------------------------------------------------- */
		
		String nome = "Maria";
		int idade = 31;
		int nasc = 12;
		double renda = 4000.00;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais e seu dia de nascimento é %d%n", nome, idade, renda, nasc);
        
		
		/*Quando houver mais de uma variavel de mesmo elemento,tem que colocar conforme irá trazer o dado no print respectivamente.
		 * 
		 * 
		 * %f = ponto flutuante
		 * %d = inteiro
		 * %s = texto
		 * %n = quebra de linha  */
		
		
		

	}

}
 