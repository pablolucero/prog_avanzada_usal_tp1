package ejercicios;

public class Ejercicio3 {

	public static boolean esPrimo(int numero) {

		// seguro hay soluciones mas optimas, no las googleo para acatar la consigna
		if (numero == 0 || numero == 1) return false;
		int i = numero;

		while (i > 2) {
			i--;
			if (numero % i == 0) return false;
		}
		return true;
	}
			
	public static void main(String[] args) {
		System.out.println("El numero " + 0 + " es primo? " + esPrimo(0));
		// El numero 0 es primo? false

		System.out.println("El numero " + 1 + " es primo? " + esPrimo(1));
		// El numero 1 es primo? false

		System.out.println("El numero " + 2 + " es primo? " + esPrimo(2));
		// El numero 2 es primo? true

		System.out.println("El numero " + 3 + " es primo? " + esPrimo(3));
		// El numero 3 es primo? true

		System.out.println("El numero " + 4 + " es primo? " + esPrimo(4));
		// El numero 4 es primo? false

		System.out.println("El numero " + 5 + " es primo? " + esPrimo(5));
		// El numero 5 es primo? true

		System.out.println("El numero " + 17 + " es primo? " + esPrimo(17));
		// El numero 17 es primo? true

		System.out.println("El numero " + 18 + " es primo? " + esPrimo(18));
		// El numero 18 es primo? false

	}

}
