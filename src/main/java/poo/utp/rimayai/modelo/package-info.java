/** Datos del sistema: pedidos, productos y clientes. */
package poo.utp.rimayai.modelo;

import java.util.Properties;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.ArrayList;
import poo.utp.rimayai.modelo.Producto;
import java.util.ArrayList;
import poo.utp.rimayai.mensajeria.CanalMensajeria;
import poo.utp.rimayai.modelo.EstadoPedido;
import poo.utp.rimayai.modelo.Pedido;
class Configuracion {

    private Properties propiedades;

    public Configuracion(String ruta) {
    }

    public String obtener(String clave) {
        return null;
    }
}

 abstract class Pedido {

     int codigo;
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
 class PedidoTelefonico extends Pedido {
    private int duracionLlamada;
    private String transcripcion;

    @Override
    public String getOrigen() {
        return null;
    }
}
 class PedidoCaja extends Pedido {
    private String cajero;
    private boolean parallevar;

    @Override
    public String getOrigen() {
        return null;
    }
}
class Menu {
    private ArrayList<Producto> productos;

    public void agregarProducto(Producto p) {
    }

    public Producto buscarProducto(String nombre) {
        return null;
    }

    // Arma la carta en texto para que la IA conozca los productos y precios.
    public String generarTextoParaIA() {
        return null;
    }
}
 class GestorPedidos {
    private ArrayList<Pedido> pedidos;
    private Menu menu;
    private CanalMensajeria canal;
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

    // Envía el aviso por WhatsApp al cliente y a la cocina.
    private void notificar(Pedido p) {
    }
}