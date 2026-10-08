package poo.utp.rimayai.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Pedido {

    protected int codigo;
    protected Cliente cliente;
    protected ArrayList<DetallePedido> detalles = new ArrayList<>();
    protected EstadoPedido estado;
    protected LocalDateTime fechaHora;

    public void agregarDetalle(DetallePedido d) {
    }

    public double calcularTotal() {
        return 0;
    }

    public void cambiarEstado(EstadoPedido e) {
    }

    public String generarResumen() {
        return null;
    }

    public abstract String getOrigen();
}
