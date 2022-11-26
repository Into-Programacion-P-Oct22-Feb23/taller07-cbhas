/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author cbhas
 */

public class Problema02 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        int contador = 2;
        int acumulador = 4;
        String mensaje = "";

        while (contador <= 110) {
            mensaje = mensaje + contador + "\n";
            contador = contador + acumulador;
            acumulador = acumulador + 2;
        }
        System.out.println(mensaje);
    }

}
