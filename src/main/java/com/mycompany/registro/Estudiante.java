package com.mycompany.registro;

import java.awt.*;

public class Estudiante {

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String tipo;
    private String nombre;
    private String edad;
    private String programa;
    private String etnia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getEdad() {
        return edad;
    }   public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }







    public Estudiante(String tipo,String nombre, String edad, String programa, String etnia){
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.etnia = etnia;
    }

    @Override
        public String toString(){
        return "\tEstudiante "+ this.tipo + "\n"
                + "\tNombre: "+ this.nombre+ "\n"
                + "\tEdad: "+ this.edad+" anios" + "\n"
                + "\tPrograma: "+ this.programa + "\n"
                + "\tEtnia: "+ this.etnia + "\n"
                ;
    }
}
