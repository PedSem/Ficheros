package Ejercicios;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        ejercicio5 ejercicio5=new ejercicio5();
        ejercicio5.Ordenarfichero();

    }
    public void Ordenarfichero(){
        PrintWriter printWriter=null;
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        Scanner scanner=new Scanner(System.in);
        try{
            printWriter=new PrintWriter("/home/usuario/Documentos/Ejerciciosficheros/Sinordenar.txt");
            String cadena;
            System.out.println("Introduce texto.Fin para acabar");
            cadena=scanner.nextLine();
            while (!cadena.equalsIgnoreCase("Fin")){
                printWriter.println(cadena);
                cadena=scanner.nextLine();
            }
            printWriter.close();
            String[]datos=cadena.split("");
            Arrays.sort(datos);
            System.out.println(Arrays.toString(datos));
            File file=new File("/home/usuario/Documentos/Ejerciciosficheros/Ordenar.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
