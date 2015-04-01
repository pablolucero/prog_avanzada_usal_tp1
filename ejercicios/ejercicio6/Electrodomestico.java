package ejercicios.ejercicio6;

public abstract class Electrodomestico {

    private int precioBase;
    private Color color;
    private CategoriaConsumoEnergetico consumoEnergetico;
    private int peso; // medido en kg

    public Electrodomestico(int precioBase, Color color, CategoriaConsumoEnergetico consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
        this.precioBase = 1000;
        this.color = Color.BLANCO;
        this.consumoEnergetico = CategoriaConsumoEnergetico.F;
        this.peso = 15;
    }

    public double precioFinal() {
        return (double) (getPrecioBase() + calcularAdicionalPeso() + calcularAdicionalConsumo());
    }


    private int calcularAdicionalPeso() {

        final int peso = getPeso();

        if (peso >= 10 && peso <= 19) return 50;
        if (peso >= 20 && peso <= 39) return 400;
        if (peso >= 40 && peso <= 59) return 700;
        if (peso >= 60) return 1000;

        return 0;
    }


    private int calcularAdicionalConsumo() {

        switch (getConsumoEnergetico()) {
            case A:
                return 800;
            case B:
                return 700;
            case C:
                return 500;
            case D:
                return 300;
            case E:
                return 100;
            case F:
                return 50;
        }

        return 0;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CategoriaConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(CategoriaConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
