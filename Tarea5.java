import java.io.IOException;

/**
 * Tarea5
 */
public class Tarea5 {

    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("mspaint");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}