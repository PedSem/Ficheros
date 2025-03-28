package ejercicios9y10;

import java.io.Serializable;

public class Empleados implements Serializable {
    private String DNI;
    private String nombre;
    private int edad;
    private double sueldo;

    public Empleados(String DNI, String nombre, int edad, double sueldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }
    public static Empleados Agregarempleados(String DNI,String nombre,int edad,double sueldo){
        return new Empleados(DNI,nombre,edad,sueldo);
    }
}
