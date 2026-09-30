public class EjecutarEstudiante {
    public static void main(String[] args) {
        // Crear un objeto de la clase Producto
        Producto producto1 = new Producto("P001", "Laptop", 1500.0, 10);

        // Mostrar la información del producto
        System.out.println(producto1.toString());

        Producto producto2 = new Producto("P002", "Smartphone", 800.0, 20);
        System.out.println(producto2.toString());

        producto1.calcularInventario();
        producto1.agregarStock(5);
        System.out.println(producto1.toString());

        producto1.venderUnidades(3);
        System.out.println(producto1.toString());

        producto1.venderUnidades(100);
        System.out.println(producto1.toString());
    }
}

class Producto {
    private String codigo;
    private String nombre;
    private double precioUnitario;
    private int stock;
    private double valorInventario;

    public Producto(String codigo, String nombre, double precioUnitario, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        calcularInventario();
    }

    public void calcularInventario() {
        valorInventario = precioUnitario * stock;
    }

    public void agregarStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            calcularInventario();
        }
    }

    public void venderUnidades(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad no válida para vender.");
            return;
        }

        if (cantidad > stock) {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades.");
            return;
        }

        stock -= cantidad;
        calcularInventario();
    }

    @Override
    public String toString() {
        calcularInventario();
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stock=" + stock +
                ", valorInventario=" + valorInventario +
                '}';
    }
}