package Ejercicios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        ejercicio9 ejercicio9=new ejercicio9();
        ejercicio9.DNI();

    }
    public void DNI(){
        Scanner scanner=new Scanner(System.in);
        FileOutputStream fileOutputStream=null;
        DataOutputStream dataOutputStream=null;
        String DNI,nombre;
        int edad,sueldo;
        try{
            fileOutputStream=new FileOutputStream("/home/usuario/Documentos/Ejerciciosficheros/DNI.txt");
            dataOutputStream=new DataOutputStream(fileOutputStream);
            System.out.print("Introduce el DNI:");
            DNI=scanner.nextLine();
            System.out.print("Introduce el nombre:");
            nombre=scanner.nextLine();
            System.out.print("Introduce la edad:");
            edad=scanner.nextInt();
            System.out.print("Introduce el sueldo:");
            sueldo=scanner.nextInt();
            dataOutputStream.writeInt(edad);
            dataOutputStream.writeInt(sueldo);
            for(int i=0;i<DNI.length();i++){
                if(Character.isLetterOrDigit(DNI.charAt(i))){
                    dataOutputStream.writeChar(DNI.charAt(i));
                }
            }
            for(int i=0;i<nombre.length();i++){
                if(Character.isLetter(nombre.charAt(i))){
                    dataOutputStream.writeChar(nombre.charAt(i));
                }
            }
            dataOutputStream.writeInt(edad);
            dataOutputStream.writeInt(sueldo);
            fileOutputStream.close();
            dataOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
