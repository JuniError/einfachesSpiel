package jpoller.view;
import javax.swing.*;
import java.awt.*;

public class GrafikFrame extends JFrame
{
    public GrafikFrame() {
        this.add(new GrafikPanel());
        this.setVisible(true);
        this.setSize(500, 300);
    }
}
