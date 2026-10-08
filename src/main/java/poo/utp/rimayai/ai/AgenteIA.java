package poo.utp.rimayai.ai;

import java.util.ArrayList;

public abstract class AgenteIA {

    protected String nombre;
    protected String apiKey;

    public abstract ArrayList<Decision> decidir();

    public abstract void ejecutar(Decision d);

    protected String consultarIA(String instrucciones, String datos) {
        return null;
    }
}
