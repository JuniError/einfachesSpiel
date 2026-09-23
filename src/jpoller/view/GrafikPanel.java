package jpoller.view;
import javax.swing.*;
import java.awt.*;

import static javax.swing.BoxLayout.PAGE_AXIS;

public class GrafikPanel extends JPanel{
    private JLabel rde = new JLabel("Tippe eine Zahl von 1 bis 9");
    private JLabel gsp = new JLabel("Gesamtpunkte: ");
    private JTextField[] txtary = new JTextField[2];

    public GrafikPanel() {
        JPanel oben = new JPanel(new GridLayout(3, 2));
        oben.add(new JLabel("Rundenergebnis:"));
        oben.add(new JLabel("Gesamtpunkte:"));
        oben.add(rde);
        oben.add(gsp);
        oben.add(new JLabel("Deine Zahl:"));
        oben.add(new JLabel("Computer:"));

        JPanel mitte = new JPanel(new GridLayout(1, 2));
        for(int i = 0; i < 2; i++) {
            txtary[i] = new JTextField();
            txtary[i].setHorizontalAlignment(JTextField.CENTER);
            mitte.add(txtary[i]);
        }

        JPanel unten = new JPanel();
        unten.setLayout(new BoxLayout(unten, PAGE_AXIS));

    }

    public void setErgebnis(int z, int check) {
        if(check == 0) {
            if(z > 0) {
                rde.setText("+" + z);
            } else if (z < 0) {
                rde.setText("" + z);
            }
        } else {
            gsp.setText("" + z);
        }
    }
}
