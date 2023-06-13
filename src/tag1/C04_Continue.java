package tag1;

import java.util.Arrays;

public class C04_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (i<10){
            if (i==4){
                i++;
                continue;
            }
            System.out.print(i + ", ");
            i++;
        }


    }
}
