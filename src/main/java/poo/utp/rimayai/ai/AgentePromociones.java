package poo.utp.rimayai.ai;

import java.util.ArrayList;
import poo.utp.rimayai.mensajeria.CanalMensajeria;
import poo.utp.rimayai.modelo.Promocion;
import poo.utp.rimayai.servicio.GestorClientes;

public class AgentePromociones extends AgenteIA {

    private GestorClientes gestorClientes;
    private CanalMensajeria canal;
    private ArrayList<Promocion> promociones;

    @Override
    public ArrayList<Decision> decidir() {
        return null;
    }

    @Override
    public void ejecutar(Decision d) {
    }
}
