package Uebungen;

import java.util.Scanner;

public class CollatzFolge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine beliebige Zahl ein: ");
        int zahl = input.nextInt();
        int count = 0;


        while (count!=10){
            if (zahl%2==1){
                if (zahl==1)
                    count++;   // ich muss die endlose schleife unterbrechen.
                zahl = zahl * 3 + 1;
                System.out.println(zahl);
            }
            else{
                zahl= zahl/2;
                System.out.println(zahl);
            }

        }
        System.out.println("ich wollte die endlose 1 4 2 schleife " + count + " mal wiederholen.");


    }

    }

