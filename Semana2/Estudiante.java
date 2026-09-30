public class Estudiante {
    public Estudiante(int i, String string, String string2, double d, double e, double f) {
        
        //TODO #1 Auto-generated constructor stub
    }
    //Atributos de la clase
    // Atributos de la clase
    int id;
    String nombre;
    double nota;
    

    // Método mostrarInformacion()
    /* firma del método:
       public : Es público
       void : no retorna nada
       mostrarInformacion() : Es el nombre del método, no recibe parámetros
    */
    public void mostrarInformacion() {
        System.out.println("id: " + id);
        System.out.println("nombre: " + nombre);
        System.out.println("nota: " + nota);
    }
}