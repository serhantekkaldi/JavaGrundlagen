package tag2;


import javax.swing.*;

public class C02_KreisTest {

    public static void main(String[] args) {
        String kreisRadius , einheit;
        double r;

        kreisRadius = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein");
        r = Double.parseDouble(kreisRadius);
        einheit = JOptionPane.showInputDialog("Geben SIe die Maßeinheit ein");

        C01_Kreis k = new C01_Kreis(r);

        System.out.println("Kreisradius: " + k.getRadius() + " " + einheit);
        System.out.println("Umfang: " + k.getUmfang() + " " + einheit);
        System.out.println("Kreisfläche: " + k.getFläche() + " " + einheit + '\u00b2');

    }
}
