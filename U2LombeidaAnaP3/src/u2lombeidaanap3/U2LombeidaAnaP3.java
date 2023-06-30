/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2lombeidaanap3;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class U2LombeidaAnaP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            String nombre=br.readLine();
            int div =8/0;
        } catch (IOException e) {
            e.printStackTrace();
        }catch(ArithmeticException es){
          System.out.println("NO EXISTE DIVISION PARA O :3");
        }
        
    }
    
}
