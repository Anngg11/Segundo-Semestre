public class BotonAscensor extends Boton {

    // 1. ATRIBUTOS
    private int pisoDestino;

    // 2. CONSTRUCTOR
    public BotonAscensor(int pisoDestino) {
        super();
        this.pisoDestino = pisoDestino;
    }

    // 3. GETTERS
    public int getPisoDestino() {
        return pisoDestino;
    }

    // 4. MÉTODOS
    @Override
    public void presionar() {
        System.out.println("  Boton interno del piso " + pisoDestino + " presionado");
        encenderIndicador();
    }

    @Override
    public String toString() {
        return "BotonAscensor [" + super.toString() + ", pisoDestino: " + pisoDestino + "]";
    }
}