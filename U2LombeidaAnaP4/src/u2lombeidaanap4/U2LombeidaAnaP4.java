/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2lombeidaanap4;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author USER
 */
public class U2LombeidaAnaP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
         BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\USER\\Documents\\NetBeansProjects\\Expeciones.txt"));
         String linea;
         try{
             while((linea=br.readLine())!=null){
              System.out.println(linea);   
         }
    }catch(IOException ex){}
    } 
}
