/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2lombeidaanalab2;

import java.util.List;

/**
 *
 * @author LOMBEIDA ANA
 */
//Clase hija
public class Laboratorio1 extends Laboratorio {
    private String espacio; 
    //Atributos

public Laboratorio1(String nombre, int capacidad, List<String> equipos, String espacio) {
        super(nombre, capacidad, equipos);//Contrutores
        this.espacio = espacio;
    }
///Metodos
    public String getEspacio() {
        return espacio;
    }
    
}
