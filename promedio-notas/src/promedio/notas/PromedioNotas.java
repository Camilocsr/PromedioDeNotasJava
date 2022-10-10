/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio.notas;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PromedioNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nc = 1; // Numero de calificaciones.
        float suma=0,calificacion;
        Scanner notas = new Scanner(System.in); // Objeto
        System.out.println("Numero de calificaciones: ");// permite ver en pantalla
        nc = notas.nextInt();// Asignacion de valor
        for(int i = 0; i <= nc; i++){// siclo for
            System.out.println("Calificacion Numero: "+(i++));// prenguntar en pantalla
            calificacion = notas.nextFloat();// asingnacion de valor
            suma = suma + calificacion;
        }
        System.out.println("El promedio del estudiante es: "+(suma/nc)); // muestra el operacion.
    }
}
