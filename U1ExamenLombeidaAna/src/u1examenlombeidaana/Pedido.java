/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1examenlombeidaana;

/**
 *
 * @author USER
 */
public class Pedido {
    private  String producto;
    private  String proveedor;
    private  double precioUnitario;
    private  int unidades;

    public Pedido(String producto, String proveedor, double precioUnitario, int unidades) {
        this.producto = producto;
        this.proveedor = proveedor;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    
    @Override
    public String toString() {
        return "Producto: " + producto +
                "\nProveedor: " + proveedor +
                "\nPrecio unitario: " + precioUnitario +
                "\nUnidades: " + unidades;
    }
}
