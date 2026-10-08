package poo.utp.rimayai.ai;

import poo.utp.rimayai.servicio.GestorClientes;
import poo.utp.rimayai.servicio.GestorPedidos;
import poo.utp.rimayai.servicio.Inventario;

public class OpenAIRealtime implements RecepcionistaVoz {

    private String apiKey;
    private String modelo;
    private boolean activa;
    private Microfono microfono = new Microfono();
    private Parlante parlante = new Parlante();
    private GestorPedidos gestor;
    private Inventario inventario;
    private GestorClientes gestorClientes;

    @Override
    public void iniciarLlamada() {
    }

    @Override
    public void finalizarLlamada() {
    }

    @Override
    public boolean estaActiva() {
        return false;
    }

    private void configurarSesion() {
    }


    private void procesarEvento(String json) {
    }


    private String consultarCliente(String argumentos) {
        return null;
    }

    private String consultarDisponibilidad(String argumentos) {
        return null;
    }


    private void registrarPedido(String argumentos) {
    }
}