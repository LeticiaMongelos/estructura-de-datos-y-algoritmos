import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese la cadena a buscar: ");
        String subCadena = consola.nextLine();

        System.out.print("Ingrese la cadena principal: ");
        String cadena = consola.nextLine();

        if(cadena.contains(subCadena)){
            System.out.println("La cadena | " + subCadena + " | es subcadena de la cadena | " + cadena + " | ");
        } else {
            System.out.println("La cadena | " + subCadena + " | no es subcadena de la cadena | " + cadena);
        }
    }
}
