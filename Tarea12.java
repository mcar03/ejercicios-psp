import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea12 {
    

    //LEER BIEN EL ENUNCIADO PQ NO SÉ SI ES ESTO LO QUE QUIERE.
    public static void main(String[] args) {
        
        String dominio = "google.es";
        try {
            Process p = Runtime.getRuntime().exec("ping " + dominio);
            BufferedReader bf = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String linea;

            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);

            }

            System.out.println("Soy el proceso padre y me voy a esperar a que muera mi hijo");
            p.waitFor();
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
