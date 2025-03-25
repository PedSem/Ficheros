package Ejercicios;

import java.io.*;
import java.util.*;

public class ejercicio5 {
    public static void main(String[] args) {
        ejercicio5 ejercicio5=new ejercicio5();
        ejercicio5.prueba();

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
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
    public void pruebaordenarfichero(){
        Scanner scanner=new Scanner(System.in);
        List<String>ordenar=new ArrayList<>();
        String cadena="";
        Scanner entrada;
        try{
            FileWriter filewriter=new FileWriter("/home/usuario/Documentos/Ejerciciosficheros/Sinordenar.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(filewriter);
            System.out.println("Introduce texto.FIN para salir");
            cadena=scanner.nextLine();
            while (!cadena.equalsIgnoreCase("Fin")) {
                bufferedWriter.write(cadena);
                bufferedWriter.newLine();
                cadena=scanner.nextLine();
                ordenar.add(cadena);
            }
            bufferedWriter.close();
            FileReader fileReader=new FileReader("/home/usuario/Documentos/Ejerciciosficheros/p.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
             cadena=bufferedReader.readLine();
            while (cadena!=null){
                Collections.sort(ordenar);
                String[]datos=cadena.split("//s+");
                Arrays.sort(datos);
                cadena=bufferedReader.readLine();
            }
            bufferedReader.close();
            for(String ordeno:ordenar){
                System.out.println(ordeno);
            }


        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void prueba(){
        String cadena;
        try{

            FileReader fileReader=new FileReader("/home/usuario/Documentos/Ejerciciosficheros/Ordenar.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            cadena=bufferedReader.readLine();
            while (cadena!=null){
                System.out.println(cadena);
                cadena= bufferedReader.readLine();
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
