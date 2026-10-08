package poo.utp.rimayai.mensajeria;

// Muestra los mensajes en consola en lugar de WhatsApp, para probar sin conexión.
public class ConsolaCanal implements CanalMensajeria {

    @Override
    public boolean enviar(String numero, String texto) {
        return false;
    }
}
