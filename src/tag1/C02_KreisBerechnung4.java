package tag1;

import javax.swing.*;

public class C02_KreisBerechnung4 {
    public static void main(String[] args) {
        // Eingabe
        String eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
        double radius = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
        String einheit = eingabe;

        // Verarbeitung
        double pi = 3.1415926;
        double umfang = 2.0 * pi * radius;
        double fläche = pi * radius *radius;

        // Ausgabe
        System.out.println("Umfang: " + umfang + " " + einheit);
        System.out.println("Fläche: " + fläche + " " + einheit + "" + '\u00b2');

    }
}
