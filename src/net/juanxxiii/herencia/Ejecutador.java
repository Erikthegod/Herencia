package net.juanxxiii.herencia;

public class Ejecutador {

    public static void main(String[] args) {
        Estudiante alumno = new Estudiante("DAM", 1, 15454, "erik", 0);
        System.out.println("Sexo:" + alumno.getTitulacion());
        System.out.println("Sexo:" + alumno.getCurso());
        System.out.println("Dni:" + alumno.getDni());
        System.out.println("Nombre:" + alumno.getNombre());
        System.out.println("Sexo:" + alumno.getSexo());
        alumno.estudiar();
    }
}
