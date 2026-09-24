package jpoller.view;
import javax.swing.*;
import java.awt.*;

import static javax.swing.BoxLayout.PAGE_AXIS;

public class GrafikPanel extends JPanel{
    private JLabel rde = new JLabel("Tippe eine Zahl von 1 bis 9");
    private JLabel gsp = new JLabel("Gesamtpunkte: ");
    private JTextField txt = new JTextField();

    public GrafikPanel() {
        BorderLayout b = new BorderLayout();
        this.setLayout(b);
        JPanel oben = new JPanel(new GridLayout(3, 2));
        oben.add(new JLabel("Rundenergebnis:"));
        oben.add(new JLabel("Gesamtpunkte:"));
        oben.add(rde);
        oben.add(gsp);
        oben.add(new JLabel("Deine Zahl:"));
        oben.add(new JLabel("Computer:"));

        JPanel mitte = new JPanel(new GridLayout(1, 2));
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setFont(new Font("SansSerif", Font.BOLD, 64));
        mitte.add(txt);
        JLabel comp = new JLabel("3");
        comp.setFont(new Font("SansSerif", Font.BOLD, 64));
        comp.setBackground(Color.WHITE);
        comp.setHorizontalAlignment(SwingConstants.CENTER);
        mitte.add(comp);

        JPanel mische = new JPanel(new GridLayout(2, 2));
        mische.add(oben);
        mische.add(mitte);

        JPanel unten = new JPanel();
        JButton btn = new JButton("Noch einmal!");
        unten.add(btn);

        this.add(mische, BorderLayout.CENTER);

        this.add(unten, BorderLayout.PAGE_END);
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
