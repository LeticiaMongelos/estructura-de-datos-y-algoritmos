 import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = consola.nextLine();

        String invertida = "";

        for(int i = cadena.length() - 1; i >= 0; i--){
            invertida += cadena.charAt(i);
        }
        System.out.println("Cadena invertida: " + invertida);

    }
}
