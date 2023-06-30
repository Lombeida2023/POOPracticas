/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2lombeidaanalab2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author LOMBEIDA ANA
 */
//Clase padre
public class Laboratorio {
    private String nombre;//Atributos
    private int capacidad;
    private List<String> equipos;

    public Laboratorio(String nombre, int capacidad, List<String> equipos) {
        this.nombre = nombre;//Contructores
        this.capacidad = capacidad;
        this.equipos = equipos;
    }
///Metodos 
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public List<String> getEquipos() {
        return equipos;
    }
    
     public boolean verificarDisponibilidad(String horario) {
        
        return true; //
    }
}
    

