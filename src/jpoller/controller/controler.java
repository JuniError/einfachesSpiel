package jpoller.controller;

import jpoller.view.GrafikFrame;

import javax.swing.*;

public class controler {
    private GrafikFrame frame;
    public controler() {
        this.frame = new GrafikFrame();
    }
    public static void main(String[] args) {
        new controler();
    }
}
