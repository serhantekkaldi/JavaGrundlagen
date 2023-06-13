package Uebungen;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ZahlenRaten {
    public static void main(String[] args) throws IOException {

        /**
         * Ein zufälliges Ratespiel:
         * Das Programm wählt eine zufällige Zahl, die der Spiler erraten soll. Nach jedem Tipp
         * wird ausgeben, ob die gesuchte Zahl grösser oder kleiner als der geratene Wert ist
         */

        // Ein Zufallszahl im Wertebereich 1 bis 200 wird ermittelt.
        Random wuerfel = new Random();
        int rateMich = wuerfel.nextInt(200) + 1;

        // Eingabe wird vorbereitet
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tipp = 0;

        do {
            // In der Schleife werden die Zahlen gelesen und gesuchten Zahl vergliechen
            System.out.println("Geben Sie einen Tipp im zahlenbereich von 1 bis 200 ab");
            tipp = Integer.parseInt(in.readLine());

            if (tipp > rateMich){
                System.out.println("Der Wert ist zu hoch");
            }
            else if (tipp < rateMich){
                System.out.println("Der Wert ist zu niedrig");
            }
           }
        while (tipp !=rateMich);  // Die Scleife endet, wenn die Zahl erraten ist

        System.out.println("Die Zahl " + tipp + " ist richtig.");


    }
}
