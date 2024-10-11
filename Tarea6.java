import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Tarea6
 */
public class Tarea6 {

    public static void main(String[] args) {
        
        String filename = "borrame.txt"; 
        File f1 = new File(filename);
        try (PrintWriter printWriter = new PrintWriter(f1)) {
            printWriter.write("Me gustan los macarrones con queso");
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.err.println("Algo ha fallao");
            // TODO Auto-generated catch block
            //e.printStackTrace();
        }
        
        try {
            Process p = Runtime.getRuntime().exec("cat " + filename);
            BufferedReader bf = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String linea;

            while ((linea = bf.readLine()) != null ) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}