package h3;

public class H3_main {

    public static void main(String[] args) {

        // zweidimensionales Array einheiten[2][15]
        int[][] einheiten = new int[2][15];

        // erste Zeile: Werte der Scheine/Münzen in Cent
        einheiten[0][0] = 50000;
        einheiten[0][1] = 20000;
        einheiten[0][2] = 10000;
        einheiten[0][3] = 5000;
        einheiten[0][4] = 2000;
        einheiten[0][5] = 1000;
        einheiten[0][6] = 500;
        einheiten[0][7] = 200;
        einheiten[0][8] = 100;
        einheiten[0][9] = 50;
        einheiten[0][10] = 20;
        einheiten[0][11] = 10;
        einheiten[0][12] = 5;
        einheiten[0][13] = 2;
        einheiten[0][14] = 1;

        // zweite Zeile: überall 0 (eigentlich schon standardmäßig 0, aber explizit)
        for (int i = 0; i < 15; i++) {
            einheiten[1][i] = 0;
        }

        // beliebiger Betrag in Cent
        int input = 6279;  // der Autograder setzt hier andere Werte ein

        int rest = input;

        // Greedy-Zerlegung: immer so viele große Scheine/Münzen wie möglich
        for (int i = 0; i < 15; i++) {
            int wert = einheiten[0][i];

            int anzahl = rest / wert;   // wie oft passt dieses Geldstück?
            einheiten[1][i] = anzahl;  // in zweite Zeile eintragen

            rest = rest % wert;        // Restbetrag aktualisieren
        }

        // keine Ausgabe nötig; der Autograder prüft Inhalt von einheiten und input
    }
}
