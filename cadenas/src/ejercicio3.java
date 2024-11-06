import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese la cadena a buscar: ");
        String subCadena = consola.nextLine();

        System.out.print("Ingrese la cadena principal: ");
        String cadena = consola.nextLine();

        for(int i = 0; i < subCadena.length(); i++){
            char caracter = subCadena.charAt(i);
            if(cadena.indexOf(caracter) == -1){
                System.out.println("La cadena | " + subCadena + " | no está incluida en la cadena | " + cadena + " |");
            } else {
                System.out.println("La cadena | " + subCadena + " | está incluida en la cadena | " + cadena + " |");
            }
        }
    }
}
