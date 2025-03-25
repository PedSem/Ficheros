package Ejercicios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        ejercicio1 ejercicio1=new ejercicio1();
        ejercicio1.Imprimir1al100();

    }
    public void Imprimir1al100(){
        Scanner scanner=new Scanner(System.in);
        PrintWriter salida=null;
        try{
            salida=new PrintWriter("/home/usuario/Documentos/Ejerciciosficheros/numnaturales.txt");

            for(int i=0;i<=100;i++){
                salida.println(i);
            }
            salida.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
