package poo.utp.rimayai.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

  

     abstract class Pedido {

        protected int codigo;
        protected Cliente cliente;
        protected ArrayList<DetallePedido> detalles = new ArrayList<>();
        protected EstadoPedido estado;
        protected LocalDateTime fechaHora;
        protected LocalDateTime horaEntrega;
        protected Repartidor repartidor;

        public void agregarDetalle(DetallePedido d) {
        }

        public double calcularTotal() {
            return 0;
        }
    }

    public void cambiarEstado(EstadoPedido e) {
    
}
    public boolean esProgramado() {
        return false;
    }

    public String generarResumen() {
        return null;
    }

    } public abstract String getOrigen();
