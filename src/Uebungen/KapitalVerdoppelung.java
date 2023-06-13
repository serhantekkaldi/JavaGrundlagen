package Uebungen;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KapitalVerdoppelung {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Kapital Wert ein");
        double startKapital = input.nextDouble();
        System.out.println("Bitte geben Sie Zinsatz ein");
        float zinssatz = input.nextFloat();

        int jahr = 0;

        double kapital = startKapital;


        do {
            kapital= kapital * (1 + zinssatz/100);
                    jahr = jahr + 1;
        }
        while (kapital< 2* startKapital);


        System.out.println("Kapitalverdoppelung nach " + jahr + " jahren");
    }
}
