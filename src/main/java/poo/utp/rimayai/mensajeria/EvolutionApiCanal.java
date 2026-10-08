package poo.utp.rimayai.mensajeria;

import java.net.http.HttpClient;

public class EvolutionApiCanal implements CanalMensajeria {

    private String urlBase;
    private String apiKey;
    private String instancia;
    private HttpClient http;

    @Override
    public boolean enviar(String numero, String texto) {
        return false;
    }
}
