import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea8Linux {
    public static void main(String[] args) {
        
        String dominio = "google.es";
        
        try {
            Process p = Runtime.getRuntime().exec("ping -c 10 " + dominio);
            BufferedReader bf = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String linea;

            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }
            p.waitFor();
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
