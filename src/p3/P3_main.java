package p3;

public class P3_main {

    public static void main(String[] args) {

        // 3x3-Matrix mit ganzen Zahlen initialisieren
        // Die konkreten Werte sind für den Algorithmus egal,
        // hier das Beispiel aus dem Blatt.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // (a) Jedes Element um 1 erhöhen und Matrix ausgeben
        for (int i = 0; i < matrix.length; i++) {              // Zeilen
            for (int j = 0; j < matrix[i].length; j++) {       // Spalten
                matrix[i][j] = matrix[i][j] + 1;
            }
        }

        System.out.println("Matrix nach (a):");
        printMatrix(matrix);
        System.out.println();

        // (b) Summe aller Elemente berechnen und ausgeben
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }

        System.out.println("Summe der Elemente (b): " + sum);
        System.out.println();

        // (c) Matrix um 90 Grad im Uhrzeigersinn drehen und ausgeben
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {           // Zeilen der Originalmatrix
            for (int j = 0; j < n; j++) {       // Spalten der Originalmatrix
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        System.out.println("Matrix nach (c) (90 Grad im Uhrzeigersinn gedreht):");
        printMatrix(rotated);
    }

    // Hilfsmethode zum Ausgeben einer Matrix
    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {             // Zeilen
            for (int j = 0; j < m[i].length; j++) {      // Spalten
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
