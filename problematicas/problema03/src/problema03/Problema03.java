/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author cbhas
 */

public class Problema03 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        int contador = 2;
        int acumulador = 3;
        String mensaje = "";

        do {
            mensaje = mensaje + contador + "\n";
            contador = contador + acumulador;
            acumulador = acumulador + 2;
        } while (contador <= 37);

        System.out.println(mensaje);
    }

}
