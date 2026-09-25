package jpoller.view;
import javax.swing.*;
import java.awt.*;

import static javax.swing.BoxLayout.PAGE_AXIS;
import static javax.swing.SwingConstants.CENTER;

public class GrafikPanel extends JPanel{

    private JLabel rde = new JLabel("Tippe eine Zahl von 1 bis 9");
    private JLabel gsp = new JLabel("Gesamtpunkte: 30");
    private JTextField[] txt = new JTextField[2];
    private JButton btn;

    public GrafikPanel() {
        BorderLayout b = new BorderLayout();
        this.setLayout(b);

        for (int i = 0; i < 2; i++) {
            this.getJLabel(i).setOpaque(true);
            this.getJLabel(i).setBackground(Color.WHITE);
        }

        JPanel oben = new JPanel(new GridLayout(3, 2, 2, 1));
        oben.add(new JLabel("Rundenergebnis:"));
        oben.add(new JLabel("Gesamtpunkte:"));
        oben.add(rde);
        oben.add(gsp);
        oben.add(new JLabel("Deine Zahl:"));
        oben.add(new JLabel("Computer:"));

        JPanel mitte = new JPanel(new GridLayout(1, 2));
        for (int i = 0; i < 2; i++) {
            txt[i] = new JTextField();
            txt[i].setHorizontalAlignment(CENTER);
            txt[i].setFont(new Font("SansSerif", Font.BOLD, 64));
            mitte.add(txt[i]);
        }
        txt[1].setEnabled(false);
        JPanel mische = new JPanel(new GridLayout(2, 2));
        mische.add(oben);
        mische.add(mitte);

        JPanel unten = new JPanel();
        this.btn = new JButton("Noch einmal!");
        this.btn.setEnabled(false);
        unten.add(this.btn);

        this.add(mische, BorderLayout.CENTER);
        this.add(unten, BorderLayout.PAGE_END);
    }

    public void setRundenErgebnis(String s) {
        rde.setText(s);
    }

    public String getRundenErgebnis() {
        return rde.getText();
    }

    public String getGesamtErgebnis() {
        return gsp.getText();
    }

    public void setGesamtErgebnis(String s) {
        gsp.setText(s);
    }

    public JButton getButton() { return this.btn; }

    public String getTxt(int i) {
        return this.txt[i].getText();
    }

    public void setTxt(String s, int i) {
        this.txt[i].setText(s);
    }

    public JTextField getTxtField(int i) {
        return txt[i];
    }

    public JLabel getJLabel(int i) {
        if(i == 0) {
            return this.rde;
        } else {
            return this.gsp;
        }
    }
}
