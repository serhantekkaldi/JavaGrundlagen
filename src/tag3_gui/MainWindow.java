package tag3_gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static sun.io.Win32ErrorMode.initialize;


public class MainWindow {
    private JFrame frmMain;
    private JTextField txtValue1;
    private JTextField txtValue2;
    private JTextField txtResult;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    MainWindow window = new MainWindow();
                    window.frmMain.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public void MainWindow(){
        initialize();
    }

    private void initialize(){
        frmMain = new JFrame();
        frmMain.setTitle("Additon zweier Zahlen");
        frmMain.setBounds(100, 100, 409, 246);
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.getContentPane().setLayout(null);
        JButton btnCalc = new JButton("Berechnen");
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double zahl1, zahl2, ergebnis;

                zahl1 = Double.parseDouble(txtValue1.getText());
                zahl2 = Double.parseDouble(txtValue2.getText());
                ergebnis = zahl1 + zahl2;
                txtResult.setText(String.valueOf(ergebnis));
            }
        });

        btnCalc.setBounds(91, 149, 103, 23);
        frmMain.getContentPane().add(btnCalc);

        JButton btnClose = new JButton("Beenden");
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnClose.setBounds(228, 149, 103, 23);
        frmMain.getContentPane().add(btnClose);

        txtValue1 = new JTextField();
        txtValue1.setFont(new Font("Tahoma",Font.BOLD,11));
        txtValue1.setForeground(new Color(220, 20, 60));
        txtValue1.setText("0");
        txtValue1.setBounds(152,44,127,20);
        frmMain.getContentPane().add(txtValue1);
        txtValue1.setColumns(10);

        txtValue2 = new JTextField();
        txtValue2.setFont(new Font("Tahoma",Font.BOLD,11));
        txtValue2.setForeground(new Color(97, 35, 47));
        txtValue2.setText("0");
        txtValue2.setBounds(152,44,127,20);
        frmMain.getContentPane().add(txtValue2);


        txtResult = new JTextField();
        txtResult.setFont(new Font("Tahoma",Font.BOLD,11));
        txtResult.setForeground(new Color(220, 20, 60));
        txtResult.setText("0");
        txtResult.setBounds(152,44,127,20);
        frmMain.getContentPane().add(txtResult);

        JLabel lblNewLabel = new JLabel("1. Zahl");
        lblNewLabel.setBounds(98,47,55,14);
        frmMain.getContentPane().add(lblNewLabel);

        JLabel lblZahl = new JLabel("2.Zahl");
        lblNewLabel.setBounds(97,77,51,17);
        frmMain.getContentPane().add(lblZahl);

        JLabel lblErgebnis = new JLabel("Ergebnis");
        lblErgebnis.setBounds(91, 109, 62, 14);
        frmMain.getContentPane().add(lblErgebnis);

    }

}
