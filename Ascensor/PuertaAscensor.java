public class PuertaAscensor extends Puerta {

    // 1. ATRIBUTOS
    private boolean mantenerAbierta;

    // 2. CONSTRUCTOR
    public PuertaAscensor(SensorPuerta sensor) {
        super(sensor);
        this.mantenerAbierta = false;
    }

    // 3. MÉTODOS
    @Override
    public void abrir() {
        abierta = true;
        System.out.println("  Puerta del ascensor: ABIERTA");
    }

    @Override
    public void cerrar() {
        if (getSensor().detectarObstaculo()) {
            System.out.println("  Puerta del ascensor: obstaculo detectado, no puede cerrar");
        } else {
            abierta = false;
            System.out.println("  Puerta del ascensor: CERRADA");
        }
    }

    // Cierra sola, a menos que alguien pidio mantenerla abierta
    public void cierreAutomatico() {
        if (!mantenerAbierta) {
            cerrar();
        }
    }

    public void mantenerAbiertas(boolean activo) {
        this.mantenerAbierta = activo;
    }

    @Override
    public String toString() {
        return "PuertaAscensor [" + super.toString() + ", mantenerAbierta: " + mantenerAbierta + "]";
    }
}