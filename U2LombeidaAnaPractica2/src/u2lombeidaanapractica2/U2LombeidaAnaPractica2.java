/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2lombeidaanapractica2;

/**
 *
 * @author USER
 */
public class U2LombeidaAnaPractica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero[]=new int[5];
        try{
            numero[7]=0;
        }
        catch(java.lang.ArrayIndexOutOfBoundsException Error){
            System.out.println("Se genero una excepcion al acceder al arreglo");
        }
    }
    
}
