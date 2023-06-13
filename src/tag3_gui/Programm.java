package tag3_gui;

import javax.swing.*;
import java.awt.*;

public class Programm {
    public static void main(String[] args) {
        try {
            JFrame m = new JFrame();
            m.setBackground(Color.getColor("blau"));
            m.setTitle("Das erste Java Fenster. . . ");
            m.setSize(800,400);
            m.setLocation(400,200);
            m.setVisible(true);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
