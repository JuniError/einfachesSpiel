package jpoller.controller;

import jpoller.view.GrafikFrame;

import javax.swing.*;
import java.awt.event.*;

public class controler implements ActionListener {
    private GrafikFrame frame;

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
            this.frame.setTxt("");
        }
    }

}
