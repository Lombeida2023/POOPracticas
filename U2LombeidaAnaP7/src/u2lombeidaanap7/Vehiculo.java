/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2lombeidaanap7;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Vehiculo {
String Placa;
int numRuedas;
boolean onStatus;
String Status;
    int ruedas = 0;

  

    public void setNumRuedas(int ruedas) {

        numRuedas=ruedas; 
        
    }
    public void setOnStatus() {
        onStatus=true;
        System.out.println("Encendido");
        
        
    }
    public void setOffStatus() {
        this.onStatus = false;
        
        System.out.println("Apagado");
    }
}
