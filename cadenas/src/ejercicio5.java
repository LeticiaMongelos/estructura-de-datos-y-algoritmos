import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = consola.nextLine();

        String invertida = "";

        for(int i = cadena.length() - 1; i >= 0; i--){
            invertida += cadena.charAt(i);
        }

        if(cadena.equals(invertida)){
            System.out.println("Es palíndrome");
        } else {
            System.out.println("No es palíndrome");
        }


    }
}
