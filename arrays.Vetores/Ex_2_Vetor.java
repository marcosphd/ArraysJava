package arrays.Vetor;
	import java.util.Scanner;
	
public class Ex_2_Vetor {


		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int[] numero = new int[6];
			int i;
			int somaPar = 0, numeroPar = 0;
			int somaImpar = 0, numeroImpar = 0;
			int contadorImpar = 0;

			System.out.println("Digite os n�meros desejados: \n");
			for (i = 0; i <= 5; i++) {
				numero[i] = entrada.nextInt();
			}
			System.out.println("\nEsses s�o os n�meros pares: ");
			
			for (i = 0; i <= 5; i++) {
				if (numero[i] % 2 == 0) {
					System.out.println(numero[i]);
					somaPar += numero[i];
				}
			}

			System.out.println("Esses s�o os n�meros �mpares: ");
			for (i = 0; i <= 5; i++) {
				if (numero[i] % 2 == 1) {
					System.out.println(numero[i]);
					somaImpar += numero[i];
					contadorImpar++;
				}
			}

			System.out.println("\nA soma dos n�meros pares � igual a: " + somaPar);
			System.out.println("A soma dos n�meros �mpares � igual a: " + somaImpar);
			System.out.println("A quatidade de n�meros �mpares � igual a: " + contadorImpar);
		}
}
