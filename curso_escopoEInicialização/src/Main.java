
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price = 400.00;
	
		double discount = 0;
		
		/* Quando se tem uma variavel dentro de if else
		 * é necessario declarar ela antes com um valor 
		 * normalmente zerada ou então criar um else com discount = (Algum valor)
		 */
		if (price < 200.00) {
			discount = price * 0.1;
		}
		
		System.out.println(discount);
	}

}
