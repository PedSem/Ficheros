import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lecturascanner {
    public static void main(String[] args) {
        File f = new File("/home/usuario/Documentos/datos.txt");
        String cadena;
        Scanner entrada;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                cadena = entrada.nextLine();
                System.out.println(cadena);
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
