package LecturaJugadores;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LecturaJugadores {
    public static void main(String[] args) {
        List<Jugadores>jugadores=new ArrayList<>();
        try{
            FileReader fileReader=new FileReader("C:\\Users\\PEDRO\\Downloads\\jugadores.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            FileWriter fileWriter=new FileWriter("C:\\Users\\PEDRO\\Downloads\\alojados.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String cadena= bufferedReader.readLine();
            while (cadena!=null){
                String[]cadenas=cadena.split(";");
                if(cadenas.length>=7){
                    String info=cadenas[7];
                    if(info.contains("H")){
                        String ran=cadenas[0];
                        String nombrejugador=cadenas[2];
                        bufferedWriter.write(ran + ";" + nombrejugador);
                        bufferedWriter.newLine();
                    }

                }
                cadena= bufferedReader.readLine();
            }
            bufferedWriter.close();
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
