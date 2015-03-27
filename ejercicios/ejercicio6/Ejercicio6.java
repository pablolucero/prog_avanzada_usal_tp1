package ejercicios.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {

	public static void main(String[] args) {

		List<Electrodomestico> lote = new ArrayList<>();

		Electrodomestico e1 = new Televisor(16);
		Electrodomestico e2 = new Lavarropas(5);

		lote.add(e1);
		lote.add(e2);

		double precioLote = 0;

		for (Electrodomestico electrodomestico : lote) {
			if (electrodomestico instanceof Televisor)
				precioLote += ((Televisor) electrodomestico).precioFinal();
			else if (electrodomestico instanceof Lavarropas)
				precioLote += ((Lavarropas) electrodomestico).precioFinal();
		}

		System.out.println("El precio del lote es: $ " + precioLote);
	}

}
