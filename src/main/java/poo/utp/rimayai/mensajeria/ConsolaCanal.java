/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.utp.rimayai.mensajeria;


// Muestra los mensajes en consola en lugar de WhatsApp, para probar sinconexión.
public class ConsolaCanal implements CanalMensajeria {
@Override
public boolean enviar(String numero, String texto) {
return false;
}
}
