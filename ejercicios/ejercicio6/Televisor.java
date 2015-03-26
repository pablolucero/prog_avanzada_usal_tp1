package ejercicios.ejercicio6;

public class Televisor extends Electrodomestico {

    private int pulgadas;

    public Televisor(int precioBase, Color color, CategoriaConsumoEnergetico consumoEnergetico, int peso, int pulgadas) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
}
