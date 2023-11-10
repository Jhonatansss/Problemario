import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class LeerArchivo {
    public static void main(String[] args) {
        try {
            String rutaArchivo = "datos.txt";

            FileReader archivo = new FileReader(rutaArchivo);

            BufferedReader lector = new BufferedReader(archivo);

            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();
        } catch (FileNotFoundException e) {

            System.err.println("Error: Archivo no encontrado. Verifica la ruta y el nombre del archivo.");
        } catch (IOException e) {

            System.err.println("Error de entrada/salida al leer el archivo.");
            e.printStackTrace();
        }
    }



}
