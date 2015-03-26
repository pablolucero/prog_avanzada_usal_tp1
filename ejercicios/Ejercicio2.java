package ejercicios;

public class Ejercicio2 {

	public static String numerosParesEnRangoN(int numero) {

		StringBuilder sb = new StringBuilder();

			int i = 0;

			while (i <= numero) {
				sb.append(i).append(", ");
				i = i + 2;
			}
			sb.setLength(sb.length() - 2);
		return sb.toString();
	}

	private static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

	public static void main(String[] args) {
		int n1 = 7;
		System.out.println("Números pares entre 0 y " + n1 + ": " + numerosParesEnRangoN(n1));
		// Números pares entre 0 y 7: 0, 2, 4, 6

		int n2 = 3;
		System.out.println("Números pares entre 0 y " + n2 + ": " + numerosParesEnRangoN(n2));
		// Números pares entre 0 y 3: 0, 2
	}
	
}
