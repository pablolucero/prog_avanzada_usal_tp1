package ejercicios.ejercicio6;

public class Lavarropas extends Electrodomestico {

    private int carga;

    public Lavarropas(int precioBase, Color color, CategoriaConsumoEnergetico consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
