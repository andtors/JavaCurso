

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String original = "abcde FGHIJ ABC abc DEFG";
	
	String s01 = original.toLowerCase();
	/*Transformar em letra minuscula*/
	String s02 = original.toUpperCase();
	/*Transformar em letra maiuscula*/
	String s03 = original.trim();
	/*Eliminar espaço após o final*/
	String s04 = original.substring(2);
	/*Pegar somente os caracteres após o numero inserido*/
	String s05 = original.substring(2, 9);
	/*Pegar somente os caracteres entre os numeros inseridos*/
	String s06 = original.replace('a', 'x');
	/*Alterar os caracteres inseridos na primeira condição
	 * pelos da segunda condição*/
	String s07 = original.replace("abc", "xy");
	/*É possivel alterar mais de um unico caracter mas necessario utilizar ""*/
	int i = original.indexOf("bc");
	/*Primeira posição em que aparece a caracter*/
	int j = original.lastIndexOf("bc");
	/*Ultima posição em que aparece a caracter*/
	
	System.out.println("Original: " + original);
	System.out.println("toLowerCase: " + s01);
	System.out.println("toUpperCase: " + s02);
	System.out.println("trim: " + s03);
	System.out.println("substring(2): " + s04);
	System.out.println("substring(2, 9): " + s05);
	System.out.println("replace('a', 'x'): " + s06);
	System.out.println("replace('abc', 'xy'): " + s07);
	System.out.println("index of 'bc': " + i);
	System.out.println("Last index of 'bc': " + j);
	
	String s = "potato apple lemon";
	String[] vect = s.split(" ");
	System.out.println(vect[0]);
	System.out.println(vect[1]);
	System.out.println(vect[2]);
	}

}
