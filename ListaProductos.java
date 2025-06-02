import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class ListaProductos {

    public static void main(String[] args) {

        boolean continuar = true;
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese el ID del producto (fin para salir): ");

            if (sc.hasNextInt()) {

                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.nextLine();

                System.out.println("Ingrese la marca del producto: ");
                String marca = sc.nextLine();

                System.out.println("Ingrese el precio del producto: ");
                double precio = sc.nextDouble();
                sc.nextLine(); 

                productos.add(new Producto(id, nombre, marca, precio));
                continuar = true;

            } else {

                String entrada = sc.next().trim().toLowerCase();
                if (entrada.equals("fin")) {
                    continuar = false;
                    System.out.println("Fin del ingreso de productos.");
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un ID numérico o 'fin' para terminar.");
                    continuar = true;
                    sc.nextLine();
                }
            }
        } while (continuar);
        sc.close();

        System.out.println("Lista de productos ingresados:");
        System.out.println("=====================================");

        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            Producto producto = it.next();
            System.out.println("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Marca: " + producto.getMarca() + ", Precio: " + producto.getPrecio());
        }

    }

}
