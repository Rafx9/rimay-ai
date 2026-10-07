package poo.utp.rimayai.ai;

import poo.utp.rimayai.servicio.GestorPedidos;

public class OpenAIRealtime implements RecepcionistaVoz {

    private String apiKey;
    private String modelo;
    private boolean activa;
    private Microfono microfono = new Microfono();
    private Parlante parlante = new Parlante();
    private GestorPedidos gestor;

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
// Interpreta los eventos JSON que envía OpenAI durante la llamada.

    private void procesarEvento(String json) {
    }
// Se ejecuta cuando la IA llama a la función registrar_pedido.

    private void registrarPedido(String argumentos) {
    }
}
