package ejercicios;

public class Ejercicio1 {

	public static double calcularPrecioFinal(double precioDelProducto) {
		return precioDelProducto * 1.21;
	}
			
	public static void main(String[] args) {
		double d1 = 34;
		System.out.println("El precio final del producto es $" + calcularPrecioFinal(d1));	
		// El precio final del producto es $41.14

		double d2 = 150.34;
		System.out.println("El precio final del producto es $" + calcularPrecioFinal(d2));
		// El precio final del producto es $181.9114
	}

}
