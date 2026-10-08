/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.utp.rimayai.ai;
import java.util.ArrayList;
public abstract class AgenteIA {
protected String nombre;
protected String apiKey;
public abstract ArrayList<Decision> decidir();
public abstract void ejecutar(Decision d);
// Envía las instrucciones y los datos del negocio a la IA y devuelve su respuesta.
protected String consultarIA(String instrucciones, String datos) {
return null;
}
}
