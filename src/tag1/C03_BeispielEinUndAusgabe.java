package tag1;

import java.util.Scanner;

public class C03_BeispielEinUndAusgabe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte ihren Namen ein:");
        String name = scan.nextLine();
        System.out.println("Geben Sie bitte ihr Alter ein: ");
        int alter = scan.nextInt();
        System.out.println("Geben Sie bitte ihre Körpergrösse ein");
        double groesse = scan.nextDouble();

        //Ausgabe
        System.out.println("Sie heissen " + name + " ,sind " + alter + "jahre alt und  sind " + groesse + " gross");

        scan.close();




    }
}
