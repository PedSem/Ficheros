package Ejercicios;

import java.io.*;

public class ejercicio3 {
    public static void main(String[] args) {
        ejercicio3 ejercicio3=new ejercicio3();
        ejercicio3.Escribirnumerosprimos();
        ejercicio3.Leernumerosprimos();


    }
    public void Escribirnumerosprimos(){
        try{
            PrintWriter printWriter;
            printWriter=new PrintWriter("/home/usuario/Documentos/Ejerciciosficheros/primos.dat");
            for(int i=1;i<=500;i++){
                if(esprimo(i)){
                    printWriter.println(i);
                }
            }
            printWriter.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public void Leernumerosprimos(){
        FileReader fileReader=null;
        try{
            fileReader=new FileReader("/home/usuario/Documentos/Ejerciciosficheros/primos.dat");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String cadena=bufferedReader.readLine();
            while (cadena!=null){
                System.out.println(cadena);
                cadena= bufferedReader.readLine();
            }


        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if(fileReader!=null){
                    fileReader.close();
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public boolean esprimo(int numero){
        if(numero<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(numero);i++){
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }
}
