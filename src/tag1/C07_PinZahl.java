package tag1;

import java.util.Scanner;

public class C07_PinZahl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren PIN Zahl ein");
        int count = 0;


        for (int i=1; i<=3; i++){
            int pinZahl= input.nextInt();

            if (pinZahl==1996){
                System.out.println("Sie haben den PIN erforderlich eingegeben.");
            }
            else {
                count++;
                if (count==3){
                    break;
                }
                System.out.println(count + ". mal haben Sie falsch eingegeben. Bitte noch mal versuchen.");
            }
        }
        System.out.println(count + ". mal haben Sie falsch eingegebn. Die karte wurde blockiert.");

    }
}