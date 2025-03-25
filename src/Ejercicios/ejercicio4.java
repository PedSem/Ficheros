package Ejercicios;

import java.io.*;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        ejercicio4 ejercicio4=new ejercicio4();
        ejercicio4.Ficheromayusculasyespacios();
        ejercicio4.LeerFichero();
    }

    public void Ficheromayusculasyespacios() {
        PrintWriter printWriter = null;
        Scanner scanner = new Scanner(System.in);
        try {
            printWriter = new PrintWriter("/home/usuario/Documentos/Ejerciciosficheros/Espacios.txt");
            String cadena;
            System.out.println("Introduce texto.Fin para acabar");
            cadena = scanner.nextLine().toUpperCase();
            while (!cadena.equalsIgnoreCase("Fin")) {
                printWriter.println(cadena.replace(" ", ""));
                cadena = scanner.nextLine().toUpperCase();
            }
            printWriter.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public void LeerFichero(){
        FileReader fileReader = null;
        try{
            fileReader = new FileReader("/home/usuario/Documentos/Ejerciciosficheros/Espacios.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String cadena1 = bufferedReader.readLine();
            while (cadena1 != null) {
                System.out.println(cadena1);
                cadena1 = bufferedReader.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
