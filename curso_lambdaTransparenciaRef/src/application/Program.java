package application;

import java.util.Arrays;

public class Program {
	public static int globalValue = 3;

	public static void main(String[] args) {
		int[] vect = new int[] { 13, 4, 15 };
		changeOddValues(vect);
		//changeOddValues: Mude os valores impares
		System.out.println(Arrays.toString(vect));
	}
	//Porém se alterarmos para numeros com dois digitos o programa já não funciona corretamente, pois o programa depende dos valores externos ou de entrada (o que está no vetor)
	//e não no metodo, fazendo com que ela não tenha transparencia referencial
	
	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				//se a divisão do numero no vetor não der zero, irá acrescentar global value que é 3
				numbers[i] += globalValue;
			}
		}
	}
}