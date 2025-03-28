package ejercicios9y10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EscribirEmpleados {
    public static void main(String[] args) {
        EscribirEmpleados escribirEmpleados=new EscribirEmpleados();
        escribirEmpleados.WriteEmployee();
    }
    public void WriteEmployee(){
        Scanner scanner=new Scanner(System.in);
        String DNI,nombre;
        int edad=0;
        double sueldo=0;

        try{
            FileOutputStream fileOutputStream=new FileOutputStream("DNI.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            boolean validar=true;
            int nempleados=0;
            do{
                try{
                    System.out.print("Introduce el numero de empleados:");
                    nempleados=scanner.nextInt();
                    validar=false;

                }catch (InputMismatchException e){
                    System.out.println("Solo se permiten numeros");
                    scanner.nextLine();

                }
            }while (validar);
            scanner.nextLine();
            System.out.println("Hay " + nempleados + " empleados en la empresa");
            for(int i=1;i<=nempleados;i++){
                System.out.println("Empleado nº" + i);
                do{
                    System.out.print("DNI del empleado:");
                    DNI=scanner.nextLine();
                }while (!VerificarDNI(DNI));
                do{
                    System.out.print("Nombre del empleado:");
                    nombre=scanner.nextLine();
                }while (!ValidarString(nombre));
                boolean continuar=true;
                do{
                    try{
                        System.out.print("Edad del empleado:");
                        edad=scanner.nextInt();
                        continuar=false;
                    }catch (InputMismatchException e){
                        System.out.println("Solo se permiten numeros");
                        scanner.nextLine();
                    }
                }while (continuar);
                continuar=true;
                do{
                    try{
                        System.out.print("Sueldo del empleado:");
                        sueldo=scanner.nextInt();
                        continuar=false;
                    }catch (InputMismatchException e){
                        System.out.println("Solo se permiten numeros");
                        scanner.nextLine();
                    }
                }while (continuar);
                Empleados empleados=Empleados.Agregarempleados(DNI,nombre,edad,sueldo);
                objectOutputStream.writeObject(empleados);
                scanner.nextLine();
            }
            fileOutputStream.close();
            objectOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public boolean VerificarDNI(String DNI){
        if(DNI.length()!=9){
            System.out.println("La longitud debe ser 9");
            return false;

        }
        for(int i=0;i<8;i++){
            if(!Character.isDigit(DNI.charAt(i))){
                System.out.println("Debe tener 8 numeros");
                return false;

            }
        }
        for(int i=8;i<9;i++){
            if(!Character.isLetter(DNI.charAt(i))){
                System.out.println("Debes incluir una letra al final");
                return false;

            }
        }
        return true;


    }
    public boolean ValidarString(String nombre){
        for(int i=0;i<nombre.length();i++){
            if(!Character.isLetter(nombre.charAt(i))){
                System.out.println("Debes incluir caracteres");
                return false;

            }
        }
        return true;
    }
}
