/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.registro;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author angel-alvaro
 */
public class Registro {


    public static String[] datos;
    public static List<Object> listaEstudiantes = new ArrayList<Object>();


    public static void agregarEstudiantes(String entrada) {
        datos = entrada.split("&");
        if (datos[1].equalsIgnoreCase("Pregrado")) {
            Pregrado estudiante = new Pregrado(datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
            listaEstudiantes.add(estudiante);
        } else if (datos[1].equalsIgnoreCase("Posgrado")) {
            Posgrado estudiante = new Posgrado(datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
            listaEstudiantes.add(estudiante);
        }
    }

    public static void listarEstudiantes() {
        for (Object estudiante : listaEstudiantes) {
            System.out.println(estudiante.toString());
        }
    }

    public static boolean procesarComandos(String entrada) {

        char opcion = entrada.charAt(0);
        boolean tf = true;

            if (opcion == '1') {
                agregarEstudiantes(entrada);
                System.out.println();

                tf = true;
            }else if (opcion == '2'){
                System.out.println("***Listado de estudiantes***\n");
                listarEstudiantes();
               // System.out.print("");
                tf = true;
            }else if (opcion == '3'){
                tf = false;
            } return tf;


       /* char opcion;
        boolean tf = true;
        opcion = entrada.charAt(0);
        switch (opcion){
            case '1':
                agregarEstudiantes(entrada);
                tf = true;
                break;
            case '2':
                System.out.println("***Listado de estudiantes\n");
                listarEstudiantes();
                tf = true;
                break;
            case '3':
                tf = false;
        }return tf;*/
    }
    public static void main(String[] args) {
        boolean tf = false;
        Scanner sc = new Scanner ( System.in);

        do{
           String entrada = sc.nextLine();
            tf = procesarComandos(entrada);
        }while(tf);

    }

}



