package Uebungen;

import java.util.Scanner;

public class Euklid {
    public static void main(String[] args) {

        int m;
        int n;
        int r;

        Scanner input = new Scanner(System.in);
        System.out.println("bitte geben Sie m Wert ein");
        m = input.nextInt();
        System.out.println("bitte geben Sie n Wert ein");
        n = input.nextInt();

        r = m%n;

        while (r>0){
            m=n;
            n=r;
            r=m%n;
            System.out.println(n);
        }



    }
}
