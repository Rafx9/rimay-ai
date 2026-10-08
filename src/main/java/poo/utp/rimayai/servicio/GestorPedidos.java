package poo.utp.rimayai.servicio;

import java.util.ArrayList;
import poo.utp.rimayai.mensajeria.CanalMensajeria;
import poo.utp.rimayai.modelo.EstadoPedido;
import poo.utp.rimayai.modelo.Pedido;

public class GestorPedidos {

    private ArrayList<Pedido> pedidos;
    private Menu menu;
    private CanalMensajeria canal;
    private Inventario inventario;
    private GestorClientes gestorClientes;
    private String numeroCocina;
    private int contador;

    public void registrarPedido(Pedido p) {
    }

    public void cambiarEstado(int codigo, EstadoPedido e) {
    }

    public Pedido buscarPedido(int codigo) {
        return null;
    }

    public ArrayList<Pedido> listarTodos() {
        return null;
    }

    public ArrayList<Pedido> listarPorEstado(EstadoPedido e) {
        return null;
    }

    private void notificar(Pedido p) {
    }
}
