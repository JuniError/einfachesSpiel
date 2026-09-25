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

        JTextField jt = gp.getTxtField(0);
        jt.addActionListener(controler);
        jt.setActionCommand("txt");
    }

    public GrafikPanel getGrafikPanel() {
        return this.gp;
    }
}
