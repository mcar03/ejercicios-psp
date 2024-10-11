import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Tarea7 {
    public static void main(String[] args) {
        
        int contadorFicheros = 1;
        String rutaClonacion = "clonacion";
        String nombreFichero = "fichero.txt";
        File file = new File(nombreFichero);
        PrintWriter pw;
        try {
            pw = new PrintWriter(file);
            pw.write("Esto es contenido que voy a tener que clonar xd");
            pw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Process p;
        try {
            p = Runtime.getRuntime().exec("cat " + nombreFichero);
            BufferedReader bf = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String linea; 

            while ((linea = bf.readLine()) != null) {

                System.out.println(linea);
            }
            
            p.destroy();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

        try {
            Process p2 = Runtime.getRuntime().exec("cp " + nombreFichero + " " + rutaClonacion);
            p2.destroy();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
