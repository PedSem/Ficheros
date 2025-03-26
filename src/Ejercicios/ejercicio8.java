package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        ejercicio8 ejercicio8=new ejercicio8();
        ejercicio8.Contarocurrencias();

    }
    public void Contarocurrencias(){
        FileReader fileReader;
        BufferedReader bufferedReader;
        int contarocurrencias=0;
        String nombre="tal";
        Scanner entrada;
        String cadena;
        String input="C:\\Users\\PEDRO\\Downloads\\ocurrencias.txt.txt";
        try{
            fileReader=new FileReader(input);
            bufferedReader=new BufferedReader(fileReader);
            entrada=new Scanner(bufferedReader);
            while (entrada.hasNext()){
                cadena=entrada.nextLine();
                String[]cadenas=cadena.split(" ");
                for(String palabra:cadenas){
                    if(palabra.equals(nombre)){
                        contarocurrencias++;
                    }

                }


            }

            System.out.println("El nombre " + nombre + " tiene un total de " + contarocurrencias + " veces");
        }catch (IOException e){
            System.out.println(e.getMessage());

        }
    }
}
