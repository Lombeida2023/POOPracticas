package u2lombeidaanap5;
import java.io.*;//Llama a todas las librerias de entrada y salida de datos
public class U2LombeidaAnaP5 {
    public static void main(String[] args) {
        try{
            BufferedReader  br= new BufferedReader(new FileReader( "C:\\Users\\USER\\Documents\\NetBeansProjects\\U2LombeidaAnaP5.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\USER\\Documents\\NetBeansProjects\\U2LombeidaAnaP5.txt"));
        bw.write("ESTO ES UN PRUEBA USANDO BUFFER");
        bw.newLine();
        bw.write("SEGUIMOS USANDO BUFFER");
        bw.newLine();
         bw.write("HOLA A TODOS");
          bw.newLine();
          bw.flush();
          String linea=br.readLine();
          while(linea !=null){
          System.out.println(linea);
          linea=br.readLine();
          }
          
    
          
          }catch(IOException e){
                  
            System.out.println("ERROR DE ENTRADA Y SALIDA "+e);
                  }
        
        
        
          
    }
    
}