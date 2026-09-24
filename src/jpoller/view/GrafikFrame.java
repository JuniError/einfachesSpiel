package jpoller.view;
import jpoller.controller.controler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GrafikFrame extends JFrame {
    private GrafikPanel gp = new GrafikPanel();

    public GrafikFrame(ActionListener controler) {
        this.setTitle("Einfaches Spiel");
        this.setVisible(true);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.add(this.gp);

        JButton btn = gp.getButton();
        btn.addActionListener(controler);
        btn.setActionCommand("ne");
    }

    public void setRundenErgebnis(String s) {
        this.gp.setRundenErgebnis(s);
    }

    public String getRundenErgebnis() {
        return this.gp.getRundenErgebnis();
    }

    public String getGesamtErgebnis() {
        return this.gp.getGesamtErgebnis();
    }

    public void setGesamtErgebnis(String s) {
        this.gp.setGesamtErgebnis(s);
    }

    public String getTxt() {
        return this.gp.getTxt();
    }

    public void setTxt(String s) {
        this.gp.setTxt(s);
    }
}
