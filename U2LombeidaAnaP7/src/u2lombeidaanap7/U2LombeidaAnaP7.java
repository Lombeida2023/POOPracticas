/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2lombeidaanap7;

/**
 *
 * @author LOMBEIDA ANA
 */
public class U2LombeidaAnaP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil();
        Vehiculo vehi= new Vehiculo();
        Motocicleta moto=new Motocicleta();
        auto.Placa="PZM0353";
        auto.numRuedas=4;
        auto.setOnStatus();
        auto.Placa="TBD06703";
        auto.numRuedas=2;
        auto.setOffStatus();
        
               System.out.println(auto.Placa+" "+auto.numRuedas+" "+auto.onStatus);
               
               System.out.println(moto.onStatus);
               
               System.out.println(vehi.onStatus);
               
    }
    
}
