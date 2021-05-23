package arrys.Matrizes;

import java.util.Scanner;


public class Ex_4_Matriz {

	public static void main(String[] args) {
	

		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		int constante;
		char opcao = 0;
		double[][] matriz3 = new double[2][2];

		Scanner ler = new Scanner(System.in);

		
		System.out.println("=Sistema de opera��es com matrizes=");
		System.out.println("Insira a primeira matriz: ");

		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				matriz1[l][c] = ler.nextDouble();
			}
		}
		System.out.println("Insira a segunda matriz: ");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				matriz2[l][c] = ler.nextDouble();
			}
		}

		while (opcao != '5') {

			
			System.out.println("Digite o que deseja fazer: ");
			System.out.println("(1) somar as duas matrizes ");
			System.out.println("(2) subtrair a primeira matriz da segunda");
			System.out.println("(3) adicionar uma constante as duas matrizes");
			System.out.println("(4) imprimir as matrizes");
			System.out.println("(5) Sair do programa");
		
			opcao = ler.next().charAt(0);

			switch (opcao) {
			case '1':
				System.out.println("Soma da matriz 1 e 2:");
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						matriz3[l][c] = (matriz1[l][c] + matriz2[l][c]);
						System.out.print(matriz3[l][c] + " | ");
					}
					System.out.println();
				}
				break;

			case '2':
				System.out.println("Subtra��o da matriz 1 e 2:");
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						matriz3[l][c] = (matriz1[l][c] - matriz2[l][c]);
						System.out.print(matriz3[l][c] + " | ");
					}
					System.out.println();
				}
				break;

			case '3':
				System.out.println("Insira a constante");
				constante = ler.nextInt();

				System.out.println("Soma da constante e matriz 1:");
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						matriz1[l][c] = (matriz1[l][c] + constante);
						System.out.print(matriz1[l][c] + " | ");
					}
					System.out.println();
				}
				System.out.println("Soma da constante e matriz 2:");
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						matriz2[l][c] = (matriz2[l][c] + constante);
						System.out.print(matriz2[l][c] + " | ");
					}
					System.out.println();
				}
				break;

			case '4':
				System.out.println("Matriz 1:");
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						System.out.print(matriz1[l][c] + " | ");
					}
					System.out.println();
				}
				System.out.println("Matriz 2:");
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						System.out.print(matriz2[l][c] + " | ");
					}
					System.out.println();
				}
				break;
			case '5':
				System.out.println("      Programa interrompido      ");
				break;
			default:
				System.out.println("Op��o n�o reconhecida");
				break;

			}
		}

	

	}
}
