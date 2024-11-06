import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = consola.nextLine();

        if(cadena.length() > 1){
            System.out.println(cadena.charAt(cadena.length()-1) + cadena.substring(0, cadena.length()-1));
        } else {
            System.out.println(cadena);
        }
    }
}
