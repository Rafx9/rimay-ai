package poo.utp.rimayai.modelo;

import java.time.LocalDate;

public class Promocion {

    private String codigo, descripcion, beneficio;
    private LocalDate vigenteHasta;
    private SegmentoCliente segmento;

    public boolean estaVigente() {
        return false;
    }

    public String generarMensaje(Cliente c) {
        return null;
    }
}
