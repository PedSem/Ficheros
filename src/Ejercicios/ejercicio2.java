package Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        ejercicio2 ejercicio2=new ejercicio2();
        File file=new File("/home/usuario/Documentos/Ejerciciosficheros/numnaturales.txt");
        ejercicio2.ObtenerSumaNumerosArchivos(file);

    }
    public void ObtenerSumaNumerosArchivos(File file){
        int numero,suma=0,cont=0;
        Scanner entrada;
        try{
            entrada=new Scanner(file);
            while (entrada.hasNextInt()){
                numero=entrada.nextInt();
                System.out.println(numero);
                suma=suma+numero;
                cont++;
            }
            System.out.println("suma " + suma);
            entrada.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
