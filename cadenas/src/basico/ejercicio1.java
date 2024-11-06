package basico;

import java.util.Scanner;
// Ejercicio 1:
// Desarrollar un algoritmo que reciba como entrada un carácter y de como salida el
// número de ocurrencias de dicho carácter en una cadena de caracteres.

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.print("¿Qué caracter desea buscar?: ");
        String caracter = consola.nextLine();

        System.out.print("Ingresa el texto donde buscaremos ese caracter: ");
        String texto = consola.nextLine();

        int contador = 0;
        for(int i = 0; i < texto.length(); i++){
        char caracterBuscar = texto.charAt(i);
            if(caracter.equals(String.valueOf(caracterBuscar))){
               contador++;
            }
        }
        System.out.println("El caracter " + caracter + " se repite " + contador + " veces." );
    }
}
