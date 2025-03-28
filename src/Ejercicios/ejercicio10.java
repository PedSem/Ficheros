package Ejercicios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ejercicio10 {
    public static void main(String[] args) {
        ejercicio10 ejercicio10=new ejercicio10();
        ejercicio10.LeerDNI();

    }
    public void LeerDNI(){
        FileInputStream fileInputStream;
        DataInputStream dataInputStream;
        String DNI,nombre;
        int edad,sueldo;
        try{
            fileInputStream=new FileInputStream("DNI.txt");
            dataInputStream=new DataInputStream(fileInputStream);
            while (dataInputStream.available()>0){
                    DNI=dataInputStream.readUTF();
                    nombre=dataInputStream.readUTF();
                    edad=dataInputStream.readInt();
                    sueldo=dataInputStream.readInt();
                if(sueldo>2000){
                    System.out.println("DNI:" + DNI);
                    System.out.println("Nombre:" +nombre);
                    System.out.println("Edad:" + edad);
                    System.out.println("Sueldo:" + sueldo);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
