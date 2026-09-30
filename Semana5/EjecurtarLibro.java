public class EjecurtarLibro {
    public static void main(String[] args) {
       
        // Creacion de los 5 libros
        Libro objlibro1 = new Libro("978-12", "Matematicas", "Roger", 1990, true);
        Libro objlibro2 = new Libro("657-34", "Fisica", "George", 1948, true);
        Libro objlibro3 = new Libro("398-09", "POO", "Lee", 1960, true);
        Libro objlibro4 = new Libro("400-39", "Calculo", "Sara", 1951, true);
        Libro objlibro5 = new Libro("001-45", "Ingles", "Scott", 1925, true);

        //Mostrar la informacion de los libros
        System.out.println(objlibro1);
        System.out.println(objlibro2);
        System.out.println(objlibro3);
        System.out.println(objlibro4);
        System.out.println(objlibro5);

        //Mostrar solo el nombre del libro 2
        System.out.println(objlibro2.getTitulo());

        //Cambiar el ISBN del libro 5
        objlibro5.setIsbn("000-00");
        System.out.println(objlibro5);    

        //Verificar si el libro 3 esta disponible
        System.out.println(objlibro3.estaDisponible()); //true

        //Prestar el libro 3
        objlibro3.prestar();

        //Verificar si el libro 3 esta disponible
        System.out.println(objlibro3.estaDisponible()); //false

        //Devolver el libro 3
        objlibro3.devolver();

        //Verificar si el libro 3 esta disponible
        System.out.println(objlibro3.estaDisponible()); //true
    }
}
