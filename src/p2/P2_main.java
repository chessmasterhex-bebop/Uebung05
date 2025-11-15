package p2;

public class P2_main {

    public static void main(String[] args) {

        // Beispielhafte Initialisierung des Arrays
        // (für den Autograder ist nur wichtig, DASS du korrekt mit einem int-Array arbeitest)
        int[] numbers = {4, 2, 3, 4, 1};

        // Variablen für maximalen Wert und kleinsten Index
        int max;
        int minIndex;

        // Annahme: das Array hat mindestens ein Element
        max = numbers[0];
        minIndex = 0;

        // Schleife über alle weiteren Elemente
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                // Neuer Maximalwert gefunden
                max = numbers[i];
                minIndex = i;
            }
            // Wenn numbers[i] == max:
            // nichts tun, damit minIndex der kleinste Index bleibt
        }

        // Ausgabe zur Kontrolle (kannst du später auch weglassen)
        System.out.println("Maximaler Wert: " + max);
        System.out.println("Kleinster Index mit diesem Wert: " + minIndex);
    }
}
