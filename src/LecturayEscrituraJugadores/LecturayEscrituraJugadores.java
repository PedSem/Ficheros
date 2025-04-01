package LecturayEscrituraJugadores;

import java.io.*;

public class LecturayEscrituraJugadores {
    public static void main(String[] args) {
        try{
            FileReader fileReader=new FileReader("/home/usuario/Descargas/jugadores.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            FileWriter fileWriter=new FileWriter("/home/usuario/Descargas/alojados.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            String cadena= bufferedReader.readLine();
            bufferedWriter.write("Lista de jugadores Benidorm Chess Open 2024");
            bufferedWriter.newLine();
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
