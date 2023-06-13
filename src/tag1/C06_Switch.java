package tag1;

import java.util.Scanner;

public class C06_Switch {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in); // obje olusturdum.. kullaniciya soru sormak icin..
        System.out.println("Bitte geben Sie den Monatzahl ein");
        int ay = sayi.nextInt();


        switch (ay){
            case 1:
                System.out.println("januar");
                break;
            case 2:
                System.out.println("Februar");
                break;
            case 3:
                System.out.println("März");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("juli");
                break;
            case 8:
                System.out.println("August");
                break;
            default:
                System.out.println("bitte die Eingabe prüfen");
        }
    }
}
