package Uebungen;

public class ZahlenDreiEcke {
    public static void main(String[] args) {

        int counter=0;

        while(counter<10) {
            int a=0;
            while(a<=counter) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
            counter++;
        }
    }

}
