package poo.utp.rimayai.modelo;

import java.time.LocalDateTime;

public class Cliente {

    private String telefono, nombre, direccion;
    private int totalPedidos;
    private double gastoTotal;
    private LocalDateTime ultimoPedido;
    private Producto productoFavorito;
    private SegmentoCliente segemento;

    public Cliente(String telefono, String nombre, String direccion) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void registrarCompra(Pedido p) {

    }

    public int diasSinComprar() {
        return 0;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTotalPedidos() {
        return totalPedidos;
    }

    public void setTotalPedidos(int totalPedidos) {
        this.totalPedidos = totalPedidos;
    }

    public double getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    public LocalDateTime getUltimoPedido() {
        return ultimoPedido;
    }

    public void setUltimoPedido(LocalDateTime ultimoPedido) {
        this.ultimoPedido = ultimoPedido;
    }

    public Producto getProductoFavorito() {
        return productoFavorito;
    }

    public void setProductoFavorito(Producto productoFavorito) {
        this.productoFavorito = productoFavorito;
    }

    public SegmentoCliente getSegemento() {
        return segemento;
    }

    public void setSegemento(SegmentoCliente segemento) {
        this.segemento = segemento;
    }

}
