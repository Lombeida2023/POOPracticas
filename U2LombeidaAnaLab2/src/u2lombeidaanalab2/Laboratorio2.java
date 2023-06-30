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
public class Laboratorio2 extends Laboratorio {
     private String lugar;//Atributos
     
public Laboratorio2(String nombre, int capacidad, List<String> equipos, String lugar) {
        super(nombre, capacidad, equipos);
        this.lugar = lugar;///Contructores
    }
//Metodos
    public String getLugar() {
        return lugar;
    }

}
