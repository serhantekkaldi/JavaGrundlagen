package Uebungen;

public class Matrix {
    public static void main(String[] args) {
        // Matrix ohne 4
        System.out.println();
        System.out.println("Matrix");
        for (int zeile = 0; zeile < 10; zeile++) {
            for (int spalte = 0; spalte < 10; spalte++) {
                if (Integer.parseInt("" + zeile + spalte) % 4 == 0 || zeile == 4 || spalte == 4) {
                    System.out.print(" " + "**");
                    continue;
                }
                System.out.print(" " + zeile + spalte);
            }
            System.out.println();
        }
    }

}
