package poo.utp.rimayai.servicio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import poo.utp.rimayai.modelo.Pedido;
import poo.utp.rimayai.modelo.Producto;
import poo.utp.rimayai.modelo.Reserva;

public class Inventario {

    private Menu menu;
    private ArrayList<Reserva> reservas = new ArrayList<>();    // Revisa el stock menos lo ya reservado para la hora pedida.    public boolean verificarDisponibilidad(Producto p, int cantidad, LocalDateTime hora) {        return false;    }    public void reservar(Pedido p) {    }    public void descontar(Pedido p) {    }    public void reponer(Producto p, int cantidad) {    }    public ArrayList<Producto> listarStockBajo() {        return null;    } }
