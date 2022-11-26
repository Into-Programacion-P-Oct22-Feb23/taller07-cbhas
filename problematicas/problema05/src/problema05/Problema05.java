/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author cbhas
 */

public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double contador = 0;
        double operacion = 1;
        double acumulador = 3;
        String mensaje = "1";

        do {
            contador = contador + 1;

            if (contador % 2 == 0) {

                operacion = operacion + 1 / acumulador;
                mensaje = String.format("%s + 1/%.0f", 
                        mensaje, 
                        acumulador);

            } else {

                operacion = operacion - 1 / acumulador;
                mensaje = String.format("%s - 1/%.0f", 
                        mensaje, 
                        acumulador);

            }
            acumulador = acumulador + 2;
        } while (contador <= 6);

        System.out.printf("%s = %s\n", mensaje, operacion);

    }

}
