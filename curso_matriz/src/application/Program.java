package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*O valor acima irá informar a quantidade de colunas e linhas 
		 * numa matriz, exemplo 3 linhas e colunas: 		[] [] []
		 * 						 		 					[] [] []
		 * 						 							[] [] [] */
		int[][] mat = new int[n][n];
				/*Dois colchetes informar o programa que é uma matriz
				 * bidimensional, 3 colchetes informam que é tridimensional*/
			
		for(int i=0; i<mat.length; i++) {
			/*mat.length; representa a quantidade de linhas a percorrer*/
			/*O primeiro for recebe a linha*/
			for (int j=0; j<mat[i].length; j++) {
				/*mat[i].length; já esse representa a quantidade de colunas*/
				/*O segundo for irá ir preenchendo as colunas j C0 j C1 j C2
				 * 										i	L0	[1] [2] [3]
			 * 						 		 			i	L1	[] [] []
			 * 						 					i	L2	[] [] []*/
				mat [i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal: ");
		for(int i = 0; i<mat.length; i++) {
			System.out.println(mat[i][i] + " ");
			/*Como os dados da diagonal estão sempre no valor da coluna e linha 
			 * ambos inserimos a posição igual*/
		}
		int neg = 0;
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if (mat[i][j] < -0 ){
					neg ++;
				}
			}
		}
		/*Como queremos percorrer toda a matriz em busca de numero negativos
		 * devemos usar os dois for's para verificar a coluna e linha
		 * da mesma forma que fizemos para criar*/
		System.out.println("Negative numbers: " + neg);
		sc.close();

	}

}
