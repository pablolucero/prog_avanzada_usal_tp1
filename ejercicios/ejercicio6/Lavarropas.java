package ejercicios.ejercicio6;

public class Lavarropas extends Electrodomestico {

    private int carga;

    public Lavarropas(int precioBase, Color color, CategoriaConsumoEnergetico consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavarropas(int carga) {
        super();
        this.carga = carga;
    }


    public Lavarropas() {
        super();
        this.carga = 5;
    }

    @Override public double precioFinal() {
        return super.precioFinal() + calcularAdicionalCarga();
    }

    private double calcularAdicionalCarga() {
        int carga = getCarga();
        if (carga >= 3 && carga <= 5) return 250;
        if (carga >= 6 && carga <= 10) return 400;
        if (carga > 10) return 800;
        return 0;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
