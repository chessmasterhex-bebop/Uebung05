package h2;

public class H2_main {

    public static void main(String[] args) {

        int n = 299;     // Beispielwert (Autograder ersetzt ihn)
        int digits = 0;
        int[] a = new int[9];   // automatisch mit 0 initialisiert

        if (n == 0) {
            digits = 1;
            a[8] = 0;
        } else {

            int temp = n;

            while (temp > 0) {
                int lastDigit = temp % 10;
                a[8 - digits] = lastDigit;

                digits++;
                temp = temp / 10;
            }
        }

        // Ausgabe gemäß Aufgabe
        System.out.println(digits);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
