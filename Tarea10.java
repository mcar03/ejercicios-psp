import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea10 {
    
    public static void main(String[] args) {
        
        ProcessBuilder pb = new ProcessBuilder("ls","-l");

        try {
            Process p = pb.start();
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
    }
}
