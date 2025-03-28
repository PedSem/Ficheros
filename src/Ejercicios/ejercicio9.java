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
        FileOutputStream fileOutputStream;
        DataOutputStream dataOutputStream;
        String DNI,nombre;
        int edad,sueldo;
        System.out.print("Introduce la cantidad de empleados:");
        int nempleados=scanner.nextInt();
        scanner.nextLine();

        try{
            fileOutputStream=new FileOutputStream("DNI.txt");
            dataOutputStream=new DataOutputStream(fileOutputStream);
            System.out.println("Hay " + nempleados + " en la empresa");
            for(int i=1;i<=nempleados;i++){
                System.out.println("Empleado " + i);
                System.out.print("Introduce el DNI:");
                DNI=scanner.nextLine();
                System.out.print("Introduce el nombre:");
                nombre=scanner.nextLine();
                System.out.print("Introduce la edad:");
                edad=scanner.nextInt();
                System.out.print("Introduce el sueldo:");
                sueldo=scanner.nextInt();
                scanner.nextLine();
                dataOutputStream.writeUTF(DNI);
                dataOutputStream.writeUTF(nombre);
                dataOutputStream.writeInt(edad);
                dataOutputStream.writeInt(sueldo);
            }
            fileOutputStream.close();
            dataOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
