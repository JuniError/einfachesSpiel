package jpoller.controller;

import jpoller.view.GrafikFrame;
import jpoller.model.GewinnModel;
import javax.swing.*;
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
                this.frame.setTxt("", i);
            }
            this.frame.setRundenErgebnis("Tippe eine Zahl von 1 bis 9");
        } else if(cmd.equals("txt")) {
            this.eingabe = Integer.parseInt(this.frame.getTxt(0));
            this.gm.berechneRunde(this.eingabe);
            this.frame.setGesamtErgebnis("" + gm.getGesamtPunkte());
        }
    }

}
