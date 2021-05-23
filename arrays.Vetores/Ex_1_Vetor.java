/*
	 *
	  (b) Armazene em uma variável inteira (simples) 
   		a soma entre os valores das posições A[0], A[1] e A[5] 
   		do vetor e mostre na tela esta soma. 
	  (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
	  (d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

package arrays.Vetor;

public class Ex_1_Vetor 
	{
	
	public static void main(String[] args) {

		int[] A = new int[6];
		int soma = 0;

		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = 100;
		A[5] = 7;

		soma = A[0] + A[1] + A[5];

		System.out.println("A soma dos números é: " + soma);

		System.out.println("\nSegue os valores do Vetor A");

		for (int i = 0; i <= 5; i++) {

			System.out.println(A[i]);
		}
	}
     

 }
