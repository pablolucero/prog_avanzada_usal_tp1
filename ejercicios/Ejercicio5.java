package ejercicios;

import java.util.Arrays;

public class Ejercicio5 {

	public static int[][] matrizIdentidad(int n) {
		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j)
					matriz[i][j] = 1;
			}
		}

		return matriz;
	}

	public static void mostrarMatriz(int[][] m) {

		for (final int[] matrixRow : m) {
			System.out.println(Arrays.toString(matrixRow));
		}
	}

	public static void main(String[] args) {
		int[][] m = matrizIdentidad(5);
		
		mostrarMatriz(m);
		// Resultado esperado
		/*
		1 0 0 0 0
		0 1 0 0 0
		0 0 1 0 0
		0 0 0 1 0
		0 0 0 0 1
		*/
	}


}
