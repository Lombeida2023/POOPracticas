/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2lombeidaanalab2;

/**
 *
 * @author LOMBEIDA ANA
 */

//Clase hija
public class Asignatura {
    private String nombre;//Atributos
    private String horario;
    private Laboratorio laboratorio;

    public Asignatura(String nombre, String horario, Laboratorio laboratorio) {
        this.nombre = nombre;
        this.horario = horario;//Contructores
        this.laboratorio = laboratorio;
    }
//Metodos
    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
    
}
