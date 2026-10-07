/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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