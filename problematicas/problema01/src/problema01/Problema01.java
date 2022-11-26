/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cbhas
 */

public class Problema01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreJugador;
        String posicionJugador;
        String mensaje = "";
        String salida;
        String listadoEdades = "";
        int edadJugador;
        int divisor = 0;
        double estaturaJugador;
        double sumaEdades = 0;
        double sumaEstaturas = 0;
        double totalEdades;
        double totalEstaturas;
        boolean bandera = true;

        do {
            System.out.println("Ingrese el nombre del jugador");
            nombreJugador = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador");
            edadJugador = entrada.nextInt();

            System.out.println("Ingrese la posición en la que juega en el"
                    + " campo");
            entrada.nextLine();
            posicionJugador = entrada.nextLine();

            System.out.println("Ingrese la estatura del jugador");
            estaturaJugador = entrada.nextDouble();

            entrada.nextLine();
            divisor = divisor + 1;
            mensaje = String.format("%s%d. %s -%s-, edad %s, estatura "
                    + "%.2f\n",
                    mensaje,
                    divisor,
                    nombreJugador,
                    posicionJugador,
                    edadJugador,
                    estaturaJugador);

            listadoEdades = String.format("%s%d\n", 
                    listadoEdades, 
                    edadJugador);

            sumaEdades = sumaEdades + edadJugador;
            sumaEstaturas = sumaEstaturas + estaturaJugador;

            System.out.println("Si desea terminar el proceso, ingrese s para "
                    + "salir");
            salida = entrada.nextLine();

            if (salida.equals("s")) {
                bandera = false;
            }
        } while (bandera);

        totalEdades = sumaEdades / divisor;
        totalEstaturas = sumaEstaturas / divisor;
        
        mensaje = String.format("%s\nListado de edades:\n%s\nEl promedio"
                + " de edades es: %.2f\nEl promedio de estaturas es: %.2f", 
                mensaje, 
                listadoEdades, 
                totalEdades, 
                totalEstaturas);
        
        System.out.println(mensaje);

    }
}
