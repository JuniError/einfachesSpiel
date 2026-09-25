package jpoller.controller;

import jpoller.view.GrafikFrame;
import jpoller.model.GewinnModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class controler implements ActionListener {
    private GrafikFrame frame;
    private int eingabe;
    private GewinnModel gm = new GewinnModel();

    public controler() {
        this.frame = new GrafikFrame(this);
    }
    public static void main(String[] args) {
        new controler();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("ne")) {
            for (int i = 0; i < 2; i++) {
                this.frame.getGrafikPanel().setTxt("", i);
            }
            this.frame.getGrafikPanel().setRundenErgebnis("Tippe eine Zahl von 1 bis 9");
            this.frame.getGrafikPanel().getTxtField(0).setEnabled(true);
        } else if(cmd.equals("txt")) {
            this.eingabe = Integer.parseInt(this.frame.getGrafikPanel().getTxt(0));
            this.gm.berechneRunde(this.eingabe);
            this.frame.getGrafikPanel().setGesamtErgebnis("" + this.gm.getGesamtPunkte());
            this.frame.getGrafikPanel().setRundenErgebnis("" + this.gm.getRundenErgebnis());
            this.frame.getGrafikPanel().setGesamtErgebnis("" + this.gm.getGesamtPunkte());
            this.frame.getGrafikPanel().setTxt("" + this.gm.getComputerZahl(), 1);
            if(this.gm.getRundenErgebnis() < 0) {
                for (int i = 0; i < 2; i++) {
                    this.frame.getGrafikPanel().getJLabel(i).setOpaque(true);
                    this.frame.getGrafikPanel().getJLabel(i).setBackground(Color.RED);
                }
            } else {
                for (int i = 0; i < 2; i++) {
                    this.frame.getGrafikPanel().getJLabel(i).setOpaque(true);
                    this.frame.getGrafikPanel().getJLabel(i).setBackground(Color.GREEN);
                }
            }
            if(this.gm.hatVerloren()) {
                this.frame.getGrafikPanel().setRundenErgebnis("Verloren!");
                this.frame.getGrafikPanel().getTxtField(0).setEnabled(false);
                this.frame.getGrafikPanel().getButton().setEnabled(false);
            } else if(this.gm.hatGewonnen()) {
                this.frame.getGrafikPanel().setRundenErgebnis("Gewonnen!");
                this.frame.getGrafikPanel().getTxtField(0).setEnabled(false);
                this.frame.getGrafikPanel().getButton().setEnabled(false);
            }
            this.frame.getGrafikPanel().getTxtField(0).setEnabled(false);
        }
    }

}
