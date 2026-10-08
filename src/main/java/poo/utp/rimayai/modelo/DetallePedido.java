package poo.utp.rimayai.modelo;

public class DetallePedido {

    private Producto producto;
    private int cantidad;
    private String nota;

    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return 0;
    }
}
