public class EjecutarEstudiante {
  public static void main(String[] args){
    
    //Creación del objeto
    Estudiante objEst1 = new Estudiante(2627,"Jose","Fisica",3.0,1.0,1.5);
    
    System.out.println(objEst1.toString());
    System.out.println(objEst1.calcularPromedio());

   if (objEst1.aprobo()) {
            System.out.println("El estudiante aprobó.");
        } else {
            System.out.println("El estudiante no aprobó.");
        }
    }  
}
