/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2lombeidaanalab2;
//LIBRERIAS
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LOMBEIDA ANA
 */
public class U2LombeidaAnaLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);/// Se utiliza para crear un objeto Scanner que permite leer la entrada del usuario desde la consola. 
        System.out.println("=============================================: ");
        System.out.print("INGRESE LA CANTIDAD DE LABORATORIOS: ");
      
        int cantidadLaboratorios = scanner.nextInt();
        scanner.nextLine(); // Se utiliza para leer una línea completa de entrada del usuario desde la consola.


        List<Laboratorio> laboratorios = new ArrayList<>();//Se utiliza para crear una lista que contendrá objetos del tipo Laboratorio, lo que te permite almacenar, acceder y manipular los objetos Laboratorio de manera flexible.
// Ciclo for
        for (int i = 0; i < cantidadLaboratorios; i++) {
            System.out.println("\n LABORATORIO " + (i + 1));
            System.out.print("NOMBRE: ");
            String nombreLab = scanner.nextLine();
            System.out.print("CAPACIDAD: ");
            int capacidadLab = scanner.nextInt();
            scanner.nextLine(); //Se utiliza para leer una línea completa de entrada del usuario desde la consola.

            System.out.print("INGRESAR LA CANTIDAD DE EQUIPOS: ");
            int cantidadEquipos = scanner.nextInt();
            scanner.nextLine(); // Se utiliza para leer una línea completa de entrada del usuario desde la consola.


            List<String> equipos = new ArrayList<>();// Se utiliza para crear una lista que contendrá objetos del tipo String, lo que te permite almacenar, acceder y manipular cadenas de texto de manera flexible.

            for (int j = 0; j < cantidadEquipos; j++) {
                System.out.print("EQUIPO" + (j + 1) + ": ");
                String equipo = scanner.nextLine();
                equipos.add(equipo);
            }

            System.out.print("TIPO DE LABORATORIO (LABORATORIO1/LABORATORIO2): ");
            String tipoLab = scanner.nextLine();

            Laboratorio laboratorio;

            if (tipoLab.equals("LABORATORIO 1")) {
                System.out.print("ESPACIO: ");
                String espacio = scanner.nextLine();
                laboratorio = new Laboratorio1(nombreLab, capacidadLab, equipos, espacio);
            } else if (tipoLab.equals("LABORATORIO 2")) {
                System.out.print("LUGAR: ");
                String lugar = scanner.nextLine();
                laboratorio = new Laboratorio2(nombreLab, capacidadLab, equipos, lugar);
            } else {
                System.out.println("TIPO DE LABOPRATORIO NO EXISTE. SE CREARA UN LAB GENERICO.");
                laboratorio = new Laboratorio(nombreLab, capacidadLab, equipos);
            }

            laboratorios.add(laboratorio);
        }

        System.out.print("\n INGRESE LA CANTIDAD DE ASIGNATURAS: ");
        int cantidadAsignaturas = scanner.nextInt();
        scanner.nextLine(); // Se utiliza para leer una línea completa de entrada del usuario desde la consola.


        List<Asignatura> asignaturas = new ArrayList<>();///Se utiliza para crear una lista que contendrá objetos del tipo Asignatura, lo que te permite almacenar, acceder y manipular los objetos Asignatura de manera flexible.

        for (int i = 0; i < cantidadAsignaturas; i++) {
            System.out.println("\n ASIGNATURA " + (i + 1));
            System.out.print("NOMBRE: ");
            String nombreAsignatura = scanner.nextLine();
            System.out.print("HORARIO: ");
            String horarioAsignatura = scanner.nextLine();

            System.out.print("LABORATORIO ASIGNADO[NOMBRE]: ");
            String nombreLabAsignado = scanner.nextLine();//Se utiliza para leer una línea de entrada del usuario y almacenarla en una variable de tipo String, permitiendo que el usuario proporcione información relevante 

            Laboratorio laboratorioAsignado = null;
//Se utiliza para declarar una variable de tipo Laboratorio e inicializarla con null, preparándola para recibir una referencia a un objeto Laboratorio más adelante en el programa
            for (Laboratorio lab : laboratorios) {
                if (lab.getNombre().equals(nombreLabAsignado)) {
                    laboratorioAsignado = lab;
                    break;
                }
            }

            if (laboratorioAsignado == null) {
                System.out.println("LABORATORIO NO EXISTENTE. SE ASIGNARA UN LAB GENEERICO.");
                laboratorioAsignado = new Laboratorio("LABORATORIO GENERICO", 0, new ArrayList<>());
                //Se utiliza para crear un nuevo objeto de la clase Laboratorio con valores específicos y asignarlo a la variable laboratorioAsignado, proporcionando un valor predeterminado o inicial 
            }

            Asignatura asignatura = new Asignatura(nombreAsignatura, horarioAsignatura, laboratorioAsignado);
            asignaturas.add(asignatura);
            //Se utiliza para agregar un objeto asignatura a la lista asignaturas, permitiendo almacenar y manipular múltiples objetos Asignatura en dicha lista.
        }

        // Mostrar información de los laboratorios
        System.out.println("=============================================: ");
        System.out.println("\n INFORMACION DE LOS LABORATORIOS:");
        System.out.println("=============================================: ");
            //El bucle for-each se utiliza para recorrer la lista laboratorios y mostrar la información de cada laboratorio, 
            //incluyendo su nombre, capacidad y equipos. Esto permite visualizar los detalles de todos los laboratorios almacenados en el sistema de gestión horario.
        System.out.println("=============================================: ");
            for (Laboratorio lab : laboratorios) {
            System.out.println("\n NOMBRE: " + lab.getNombre());
            System.out.println(" CAPACIDAD: " + lab.getCapacidad());
            System.out.println("EQUIPOS: " + lab.getEquipos());
        System.out.println("=============================================: ");
        ///se utiliza para identificar el tipo específico de laboratorio en cada iteración y realizar acciones o mostrar atributos específicos según el tipo de laboratorio encontrado.
        ///Esto permite trabajar con atributos o comportamientos adicionales de cada subclase de Laboratorio.
            if (lab instanceof Laboratorio1) {
                Laboratorio1 lab1 = (Laboratorio1) lab;
                System.out.println("ESPACIO: " + lab1.getEspacio());
            } else if (lab instanceof Laboratorio2) {
                Laboratorio2 lab2 = (Laboratorio2) lab;
                System.out.println("LUGAR: " + lab2.getLugar());
            }
        }
       System.out.println("=============================================: ");
        scanner.close();/// Se utiliza para cerrar el objeto Scanner y liberar los recursos asociados
        //a él una vez que hayas terminado de utilizarlo para leer la entrada del usuario.
    }
}
    
    
    

