package Ejercicios;

import java.io.*;
import java.util.*;

public class ejercicio5 {
    public static void main(String[] args) {
        ejercicio5 ejercicio5=new ejercicio5();
        ejercicio5.Ordenarfichero();

    }
    public void Ordenarfichero(){
        String inputFile = "C:\\Users\\PEDRO\\Downloads\\sinordenar.txt";
        String outputFile = "C:\\Users\\PEDRO\\Downloads\\ordenar.txt";

        List<String> palabras = new ArrayList<>();
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        FileReader fileReader=null;
        try{
            fileReader=new FileReader(inputFile);
            bufferedReader=new BufferedReader(fileReader);
            String cadena= bufferedReader.readLine();
            while (cadena!=null){
                String[]cadenas=cadena.split(" ");
                for(String palabra:cadenas){
                    if(!palabra.isEmpty()){
                        palabras.add(palabra);
                    }

                }
                cadena=bufferedReader.readLine();
            }

            bufferedReader.close();
            fileReader.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        Collections.sort(palabras);
        try{
            FileWriter fileWriter=new FileWriter(outputFile);
            bufferedWriter=new BufferedWriter(fileWriter);
            for(String palabra:palabras){
                bufferedWriter.write(palabra);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
