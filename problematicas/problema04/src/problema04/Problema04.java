/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author cbhas y bleaitenti
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double contador = 0;
        double operacion = 1;
        double acumuladora = 3;
        String salida = "1";

        while (contador <= 6) {
            contador = contador + 1;
            if (contador % 2 == 0) {
                salida = String.format("%s + 1/%.0f",
                        salida,
                        acumuladora);
                operacion = operacion + 1 / acumuladora;
            } else {
                salida = String.format("%s - 1/%.0f",
                        salida,
                        acumuladora);
                operacion = operacion - 1 / acumuladora;

            }

            acumuladora = acumuladora + 2;

        }

        System.out.printf("%s = %s\n", salida, operacion);

    }
}
