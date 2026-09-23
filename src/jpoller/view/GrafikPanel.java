package jpoller.view;
import javax.swing.*;
import java.awt.*;

public class GrafikPanel extends JPanel{
    private JLabel rde = new JLabel("Tippe eine Zahl von 1 bis 9");
    private JLabel gsp = new JLabel("Gesamtpunkte: ");

    public GrafikPanel() {
        JPanel oben = new JPanel(new GridLayout(3, 2));
        oben.add(new JLabel("Rundenergebnis:"));
        oben.add(new JLabel("Gesamtpunkte:"));
        oben.add(rde);
        oben.add(gsp);
        oben.add(new JLabel("Deine Zahl:"));
        oben.add(new JLabel("Computer:"));
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
