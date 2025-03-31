package LecturaJugadores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LecturaJugadores {
    public static void main(String[] args) {
        List<Jugadores>jugadores=new ArrayList<>();
        try{
            FileReader fileReader=new FileReader("/home/usuario/Descargas/jugadores.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String cadena= bufferedReader.readLine();
            while (cadena.equalsIgnoreCase("H")){
                cadena= bufferedReader.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
