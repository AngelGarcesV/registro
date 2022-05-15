package com.mycompany.registro;

public class Posgrado extends Estudiante{

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    private String modalidad;

    public Posgrado(String tipo, String nombre, String edad, String programa, String etnia, String modalidad) {
        super(tipo, nombre, edad, programa, etnia);
        this.modalidad = modalidad;
    }
    public String toString(){

        return "\tEstudiante "+ getTipo() + "\n"
                + "\tNombre: "+ getNombre()+ "\n"
                + "\tEdad: "+ getEdad()+" anios" + "\n"
                + "\tPrograma: "+ getPrograma() + "\n"
                + "\tEtnia: "+ getEtnia() + "\n"
                + "\tModalidad: "+ this.modalidad;
    }
}
