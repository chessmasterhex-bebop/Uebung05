package p1;

import java.util.Scanner;

public class P1_main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ============================================================
        // Eingabe
        // ============================================================
        System.out.print("Gib einen Startwert ein (double, auch negativ/Komma erlaubt): ");
        double x = sc.nextDouble();

        System.out.println("\n===== WHILE-VERSION =====");
        runWhileVersion(x);

        System.out.println("\n===== FOR-VERSION =====");
        runForVersion(x);

        System.out.println("\n===== DO-WHILE-VERSION =====");
        runDoWhileVersion(x);

        sc.close();
    }


    // ============================================================
    // 1) WHILE-VERSION (1:1 Originalcode, nur mit double + Scanner)
    // ============================================================
    public static void runWhileVersion(double start) {

        double x = start;

        while (x <= 10) {
            x = x + 1;
            System.out.println(x);
        }
    }


    // ============================================================
    // 2) FOR-VERSION (exakte Übersetzung)
    // ============================================================
    public static void runForVersion(double start) {

        for (double x = start; x <= 10; ) {
            x = x + 1;
            System.out.println(x);
        }
    }


    // ============================================================
    // 3) DO-WHILE-VERSION (exakte Übersetzung)
    // ============================================================
    public static void runDoWhileVersion(double start) {

        double x = start;

        // do-while läuft sonst 1x MINDESTENS → hier verhindern
        if (x <= 10) {
            do {
                x = x + 1;
                System.out.println(x);
            } while (x <= 10);
        }
    }
}
