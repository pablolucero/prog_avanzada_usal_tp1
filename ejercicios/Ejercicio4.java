package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 0;

		while (num != -1) {

			System.out.println("Ingrese un numero para saber si es primo o -1 para salir: ");
			num = scanner.nextInt();

			final boolean esPrimo = Ejercicio3.esPrimo(num);

			if (num > -1) {
				if (esPrimo) System.out.println("Es primo");
				else System.out.println("No es primo");
			}
		}
	}
}
