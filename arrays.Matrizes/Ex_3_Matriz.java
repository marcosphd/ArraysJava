package arrys.Matrizes;
import java.util.Scanner;

public class Ex_3_Matriz {

	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int contador10 = 0;

		for (int l = 0; l <3; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Digite os valores (%d,%d): ", l, c);
				matriz[l][c] = entrada.nextInt();
			}
			System.out.println();
		}
		for (int l = 0; l< 3 ; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c]+ " | " );
			}
			System.out.println();
		}
		for (int l = 0; l< 3; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				if (matriz[l][c] > 10) {
					contador10++;
				}
			}

		}
		System.out.println("O total de números maiores que 10 existentes na matriz é de: " + contador10);

	}
}
