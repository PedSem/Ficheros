package ejercicios9y10;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class LecturaEmpleados {
    public static void main(String[] args) {
        LecturaEmpleados lecturaEmpleados=new LecturaEmpleados();
        File file=new File("DNI.txt");
        lecturaEmpleados.LeerEmpleados(file);

    }
    public void LeerEmpleados(File file){
        try{
            FileInputStream fileInputStream=new FileInputStream(file);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            while (fileInputStream.available()>0){
                Empleados empleados=(Empleados) objectInputStream.readObject();
                   if(empleados.getSueldo()>2000){
                        System.out.println("DNI:"+ empleados.getDNI());
                        System.out.println("Nombre:" + empleados.getNombre());
                        System.out.println("Edad:" + empleados.getEdad());
                        System.out.println("Sueldo:" + empleados.getSueldo());
                       System.out.println();
                    }


            }
            fileInputStream.close();
        }catch (Exception e){
           e.printStackTrace();
        }

    }
}
