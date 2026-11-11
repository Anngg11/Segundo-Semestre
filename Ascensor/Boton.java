public abstract class Boton {

    // 1. ATRIBUTOS
    protected boolean iluminado;
    protected boolean sonidoActivo;

    // 2. CONSTRUCTOR
    public Boton() {
        this.iluminado = false;
        this.sonidoActivo = true;
    }

    // 3. GETTERS
    public boolean isIluminado() {
        return iluminado;
    }

    // 4. MÉTODOS
    public abstract void presionar();

    public void encenderIndicador() {
        iluminado = true;
        if (sonidoActivo) {
            System.out.println("  *beep*");
        }
    }

    public void apagarIndicador() {
        iluminado = false;
    }

    @Override
    public String toString() {
        return "iluminado: " + iluminado + ", sonidoActivo: " + sonidoActivo;
    }
}