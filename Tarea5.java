import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Tarea5
 */
public class Tarea5 {

    public static void main(String[] args) {
      /*/  try {
            Process p = Runtime.getRuntime().exec("mspaint");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
*/
           try {

            Process p = Runtime.getRuntime().exec("cmd.exe /c dir C:\\Users\\mañana\\Desktop");
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String linea; 

            while ((linea = br.readLine())!=null) {
                System.out.println(linea);
            }
            System.out.println("Acabado de leer");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}