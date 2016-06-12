package net.juanxxiii.herencia;

   public class Humano extends Abstracta{
       public static final int MUJER = 1;
       public static final int HOMBRE = 0;
       public static final int SINDEFINIR = -1;
       private int dni;
       private String nombre;
       private int sexo;   

    public Humano(int dni, String nombre, int sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    @Override
    void estudiar() {
        System.out.println("Estudio");
    }
}
