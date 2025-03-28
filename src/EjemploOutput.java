import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EjemploOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int n;
        double n2;
        try {
            fos = new FileOutputStream("dato.txt");
            salida = new DataOutputStream(fos);
            System.out.print("Introduce número entero. -1 para acabar: ");
            n = sc.nextInt();
            while (n != -1) {
                salida.writeInt(n); //se escribe el número entero en el fichero
                System.out.print("Introduce número entero. -1 para acabar: ");
                n = sc.nextInt();
            }
            System.out.print("Introduce un numero double. -1 para acabar:");
            n2=sc.nextDouble();
            while (n2!=-1){
                salida.writeDouble(n2);
                System.out.print("Introduce un numero double. -1 para acabar:");
                n2=sc.nextDouble();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
