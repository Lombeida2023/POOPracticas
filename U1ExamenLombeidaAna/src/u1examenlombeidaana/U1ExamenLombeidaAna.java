/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u1examenlombeidaana;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class U1ExamenLombeidaAna {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=================Menu===============");
            System.out.println("1. Productos");
            System.out.println("2. Proveedores");
            System.out.println("3. Nuevo pedido");
            System.out.println("4. Pedido mayor");
            System.out.println("5. Total facturado");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
             System.out.println("================================");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarProductos(scanner, productos);
                    break;
                case 2:
                    ingresarProveedores(scanner, proveedores);
                    break;
                case 3:
                    ingresarPedido(scanner, productos, proveedores, pedidos);
                    break;
                case 4:
                    mostrarPedidoMayor(pedidos);
                    break;
                case 5:
                    mostrarTotalFacturado(pedidos);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 6);
    }
  private static void ingresarProductos(Scanner scanner, ArrayList<Producto> productos) {
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el nombre del producto #" + (i + 1) + ": ");
            String nombre = scanner.next();
            System.out.print("Ingrese el precio del producto #" + (i + 1) + ": ");
            String precio = scanner.next();
            productos.add(new Producto(nombre));
            productos.add(new Producto(precio));
        }
        System.out.println("Productos ingresados correctamente.");
    }

    private static void ingresarProveedores(Scanner scanner, ArrayList<Proveedor> proveedores) {
        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese el nombre del proveedor #" + (i + 1) + ": ");
            String nombre = scanner.next();
            proveedores.add(new Proveedor(nombre));
        }
        System.out.println("Proveedores ingresados correctamente.");
    }

    private static void ingresarPedido(Scanner scanner, ArrayList<Producto> productos,
                                       ArrayList<Proveedor> proveedores, ArrayList<Pedido> pedidos) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.next();
        Producto producto = buscarProducto(productos, nombreProducto);
        if (producto == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        System.out.print("Ingrese el nombre del proveedor: ");
        String nombreProveedor = scanner.next();
        Proveedor proveedor = buscarProveedor(proveedores, nombreProveedor);
        if (proveedor == null) {
            System.out.println("Proveedor no encontrado.");
            return;
        }

        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de unidades: ");
        int unidades = scanner.nextInt();

       // Pedido ola = new Pedido( precioUnitario, unidades);
       // pedidos.add();
        System.out.println("Pedido ingresado correctamente.");
    }

    private static Producto buscarProducto(ArrayList<Producto> productos, String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    private static Proveedor buscarProveedor(ArrayList<Proveedor> proveedores, String nombre) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNombre1().equalsIgnoreCase(nombre)) {
                return proveedor;
            }
        }
        return null;
    }

    private static void mostrarPedidoMayor(ArrayList<Pedido> pedidos) {
        Pedido pedidoMayor = null;
        for (Pedido pedido : pedidos) {
            if (pedidoMayor == null || pedido.getUnidades() > pedidoMayor.getUnidades()) {
                pedidoMayor = pedido;
            }
        }

        if (pedidoMayor != null) {
            System.out.println("Pedido con más unidades:");
            System.out.println(pedidoMayor);
        } else {
            System.out.println("No se encontraron pedidos.");
        }
    }

    private static void mostrarTotalFacturado(ArrayList<Pedido> pedidos) {
        double totalFacturado = 0;
        for (Pedido pedido : pedidos) {
            totalFacturado += pedido.getPrecioUnitario() * pedido.getUnidades();
        }
        System.out.println("Total facturado: $" + totalFacturado);
    }
}
    
    

