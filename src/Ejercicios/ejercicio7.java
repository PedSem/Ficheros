package Ejercicios;

import java.io.*;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        ejercicio7 ejercicio7=new ejercicio7();
        File file=new File("/home/usuario/Documentos/Ejerciciosficheros/contar.txt");
        ejercicio7.MostrarArchivoPantalla(file);



    }
    public void MostrarArchivoPantalla(File file){
        String cadena;
        Scanner entrada;
        try{
            entrada=new Scanner(file);
            while (entrada.hasNext()){
                cadena=entrada.nextLine();
                System.out.println(cadena);
            }
            entrada.close();
        }catch ( FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
