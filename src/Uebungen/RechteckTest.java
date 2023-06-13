package Uebungen;

import java.util.Scanner;

public class RechteckTest {

    public static void main(String[] args) {


        // Eingabe
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Länge ein: ");
        double l = input.nextDouble();
        System.out.println("Bitte geben Sie Breite Wert ein: ");
        double b = input.nextDouble();
        input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Masseinheit ein: ");
        String einheit = input.nextLine();


        // erzeugen die obje
        Rechteck obj = new Rechteck(l,b);
        System.out.println("Lange Seite: " + obj.getLangeSeite() + einheit);
        System.out.println("Kurze Seite: " + obj.getKurzeSeite() + einheit);
        System.out.println("Diagonale: " + obj.getDiagonale() + einheit);
        System.out.println("Fläche: " + obj.getFlaeche() + einheit );
        System.out.println("Umfang: " + obj.getUmfang() + einheit + "²");





    }


}
