package Ejercicios;

import java.io.*;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        ejercicio6 ejercicio6=new ejercicio6();
        ejercicio6.contar();

    }
    public void contar(){
        String inputfile="/home/usuario/Documentos/Ejerciciosficheros/contar.txt";
        String input="C:\\Users\\PEDRO\\Downloads\\contar.txt";
       String cadena;
       int contvocal=0,contconsonante=0,contnumeros=0,contalfa=0;
        FileReader fileReader;
        BufferedReader bufferedReader;
        Scanner entrada;
       try{
           fileReader=new FileReader(inputfile);
           bufferedReader=new BufferedReader(fileReader);
           entrada=new Scanner(bufferedReader);
           while (entrada.hasNext()){
               cadena=entrada.nextLine();
               for(int i=0;i<cadena.length();i++){
                   if(Character.isLetter(cadena.charAt(i))){
                       contalfa++;
                   }
               }
               for(int i=0;i<cadena.length();i++){
                   if(cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u'){
                       contvocal++;
                   }
                   if(Character.isDigit(cadena.charAt(i))){
                       contnumeros++;
                       while (i<cadena.length() && Character.isDigit(cadena.charAt(i))){
                           i++;
                       }
                   }
               }
                contconsonante=contalfa-contvocal;

           }
           System.out.println("Numero de vocales " + contvocal);
           System.out.println("Numero de consonantes " + contconsonante);
           System.out.println("Numeros leidos " + contnumeros);
           fileReader.close();
           bufferedReader.close();


       }catch (IOException e){
           System.out.println(e.getMessage());
       }


    }

}
