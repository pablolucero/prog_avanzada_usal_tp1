package ejercicios.ejercicio6;

public class Televisor extends Electrodomestico {

    private int pulgadas;

    public Televisor(int precioBase, Color color, CategoriaConsumoEnergetico consumoEnergetico, int peso, int pulgadas) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
    }

    public Televisor(int pulgadas) {
        super();
        this.pulgadas = pulgadas;
    }

    public Televisor() {
        super();
        this.pulgadas = 15;
    }

    @Override public double precioFinal() {
        return super.precioFinal() + calcularAdicionalPulgadas();
    }

    private double calcularAdicionalPulgadas() {
        int pulgadas = getPulgadas();
        if (pulgadas >= 10 && pulgadas <= 15) return 150;
        if (pulgadas >= 16 && pulgadas <= 20) return 500;
        if (pulgadas > 20) return 700;
        return 0;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
}
