import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = consola.nextLine();

        if(cadena.length() > 1){
            System.out.println(cadena.substring(1) + cadena.charAt(0));
        } else {
            System.out.println(cadena);
        }
    }
}
