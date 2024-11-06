public class parcial2 {
    public static void main(String[] args) {
        int n = 7; // tamaño de la matriz
        int[][] matriz = new int[n][n];

        System.out.println("Matriz");
        for (int f = 0; f < n; f++){
            for (int c = 0; c < n; c++){
                // para la diagonal principal
                if(f == c && f >= (n/2)){
                    matriz[f][c] = 12;
                }
                // para la diagonal secundaria
                if((f+c) == n -1 && f >= (n/2)){
                    matriz[f][c] = 12;
                }
                //incrementos de 10 bajo las diagonales
                for(int )
            System.out.print(matriz[f][c] + "|");
            }
        System.out.println();
        }
    }
}
