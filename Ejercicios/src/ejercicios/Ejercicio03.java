/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double calificacion;
        String nombre;
        int i = 1;
        boolean bandera;
        do {
            try {
                bandera = false;
                while (i <= 4) {

                    System.out.println("Ingrese calificación: ");
                    calificacion = entrada.nextDouble();
                    if (calificacion > 10 || calificacion < 0) {
                        throw new Exception("Valor fuera del rango disponible\n");
                    }
                    entrada.nextLine();
                    System.out.println("Ingrese nombre: ");
                    nombre = entrada.nextLine();

                    if ("Ana".equals(nombre) || "Mario".equals(nombre)
                            || "Pedro".equals(nombre)
                            || "Carolina".equals(nombre)
                            || "Luis".equals(nombre)) {
                        throw new Exception("Ese nombre no está disponible.\n");
                    }
                    System.out.printf("Nombre: %s\n"
                            + "Calificación: %.1f\n",
                            nombre, calificacion);
                    i = i + 1;
                }
                System.out.printf("%s\n", "Gracias por usar el sistema");

            } catch (InputMismatchException inputMismatchException) {
                System.out.printf("de tipo  %s\n",
                        inputMismatchException);
                bandera = true;
            } catch (Exception e) {
                System.out.printf("Lo sentimos hay un error, %s\n", e);
                bandera = true;
            }
        } while (bandera);
    }
}
