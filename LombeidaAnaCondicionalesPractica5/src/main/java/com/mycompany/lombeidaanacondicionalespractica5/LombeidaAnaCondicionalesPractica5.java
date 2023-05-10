/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lombeidaanacondicionalespractica5;

/**
 *
 * @author ESPE
 */
public class LombeidaAnaCondicionalesPractica5 {

    public static void main(String[] args) {
        
        int hora=-5;
        if(hora >= 0 && hora <= 12){
        System.out.println("Buenos dias ");  
        }else if (hora >12 && hora <=18){
         System.out.println("Buenas tardes!");   
        }else {
        System.out.println("Buenas noches");
    }
}
    
}