package ejercicios.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {

	public static void main(String[] args) {

		List<Electrodomestico> lote = new ArrayList<>();

		Electrodomestico e0 = new Televisor(16);
		Electrodomestico e1 = new Televisor();
		Electrodomestico e2 = new Lavarropas(5);
		Electrodomestico e3 = new Lavarropas(10);
		Electrodomestico e4 = new Lavarropas();

		lote.add(e0);
		lote.add(e1);
		lote.add(e2);
		lote.add(e3);
		lote.add(e4);

		double precioLote = 0;
		int televisores = 0;
		int lavarropas = 0;

		for (Electrodomestico electrodomestico : lote) {
			if (electrodomestico instanceof Televisor) {
				precioLote += ((Televisor) electrodomestico).precioFinal();
				televisores++;
			}
			else if (electrodomestico instanceof Lavarropas) {
				precioLote += ((Lavarropas) electrodomestico).precioFinal();
				lavarropas++;
			}
		}

		System.out.println("El precio del lote es: $ " + precioLote);
		System.out.println("Cantidad de TVs: " + televisores);
		System.out.println("Cantidad de lavarropas: " + lavarropas);
	}

}
