
package net.juanxxiii.herencia;

public class Estudiante extends Humano{
    private String titulacion;
    private int curso; 

    public Estudiante(String titulacion, int curso, int dni, String nombre, int sexo) {
        super(dni, nombre, sexo);
        this.titulacion = titulacion;
        this.curso = curso;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }
    
}
