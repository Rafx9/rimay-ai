package poo.utp.rimayai.ai;

import java.util.ArrayList;
import poo.utp.rimayai.servicio.GestorPedidos;
import poo.utp.rimayai.servicio.GestorReparto;

public class AgenteReparto extends AgenteIA {

    private GestorReparto gestorReparto;
    private GestorPedidos gestorPedidos;

    @Override
    public ArrayList<Decision> decidir() {
        return null;
    }

    @Override
    public void ejecutar(Decision d) {
    }
}
