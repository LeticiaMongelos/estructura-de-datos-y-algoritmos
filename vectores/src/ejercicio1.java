import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        // Nivel: Básico
        /*
        Ingresar un vector A de 10 componentes (o elementos) numéricos.
        Imprimir el vector.
         */
        int[] vectorA = new int[10];

        for (int indice = 0; indice < 10; indice++) {
            System.out.print("Ingrese el elemento de la posición " + (indice + 1) + ": ");
            Scanner consola = new Scanner(System.in);
            vectorA[indice] = consola.nextInt();
        }
        System.out.println("-----------Vector A-----------");
        for (int indice = 0; indice < vectorA.length; indice++) {
            System.out.print(vectorA[indice] + " / ");
        }

    }
}