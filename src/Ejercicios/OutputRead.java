package Ejercicios;

import java.io.*;

public class OutputRead {
    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream entrada = null;
        int n;
        double n2;
        try {
            fis = new FileInputStream("dato.txt");
            entrada = new DataInputStream(fis);
            while (entrada.available()>0) {
                n = entrada.readInt();
                n2=entrada.readDouble();
                //se lee un entero del fichero
                System.out.println(n);
                //se muestra en pantalla
                System.out.println(n2);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
