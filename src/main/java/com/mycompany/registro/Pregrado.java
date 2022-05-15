package com.mycompany.registro;

public class Pregrado extends Estudiante{
    private String creditos;

    public Pregrado(String tipo, String nombre, String edad, String programa, String etnia, String creditos){
        super(tipo, nombre, edad, programa, etnia);
        this.creditos = creditos;
    }

    @Override
    public String toString(){

        return "\tEstudiante "+ getTipo() + "\n"
                + "\tNombre: "+ getNombre()+ "\n"
                + "\tEdad: "+ getEdad()+" anios" + "\n"
                + "\tPrograma: "+ getPrograma() + "\n"
                + "\tEtnia: "+ getEtnia() + "\n"
                + "\tCreditos aprobados: "+ this.creditos;
    }
}
