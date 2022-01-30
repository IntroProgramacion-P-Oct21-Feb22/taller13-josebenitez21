/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i = 1;
        double suma = 0;
        boolean bandera;

        do {
            try {
                double calificacion;
                double promedio;
                int numeroCalificaciones = 4;
                bandera = false;
                while (i <= 4) {

                    System.out.println("Ingrese calificación: ");
                    calificacion = entrada.nextDouble();

                    if (calificacion > 10 || calificacion < 0) {
                        throw new Exception("El valor ingresado no se encuentra"
                                + " en el rango permitido, intente nuevamente.\n");
                    }
                    suma = suma + calificacion;
                    i = i + 1;
                }
                promedio = suma / numeroCalificaciones;

                System.out.printf("Su promedio es: %.2f\n", promedio);

            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Hay un error de tipo %s\n",
                        inputMismatchException);
                bandera = true;

            } catch (Exception e) {

                System.out.printf("Error %s\n", e);

                bandera = true;
            }
        } while (bandera);

    }
}
