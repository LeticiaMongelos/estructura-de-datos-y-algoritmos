import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /*
        Nivel Básico

        - Ingresar un vector B de N componentes numéricos. Imprimir el vector.

         */
        boolean esValido = false;
        double N;
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa la longitud del vector: ");
        N = consola.nextDouble();

        while(N < 0 || N % 1 != 0){
            System.out.println("Error. Debe ingresar un número entero positivo.") ;
            System.out.print("Ingresa la longitud del vector: ");
            N = consola.nextDouble();
            if(N > 0 && N % 1 == 0){
                esValido = true;
            }
        }
        int longitudVector = (int)N;

        int[] vectorB = new int[longitudVector];

        for(int indice = 0; indice < longitudVector; indice++){
            System.out.print("Ingrese el elemento de la posición " + (indice + 1) + ": ");
            vectorB[indice] = consola.nextInt();
        }

        System.out.println("---------Vector B---------");
        for(int indice = 0; indice < longitudVector; indice++){
            System.out.print(vectorB[indice] + " / ");
        }
    }
}
