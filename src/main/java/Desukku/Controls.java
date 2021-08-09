package Desukku;

import javax.swing.*;
import java.awt.*;

public class Controls extends JPanel {
    Controls() {
        this.setBackground(GameWindow.bgColor);
        this.setPreferredSize(new Dimension(0, 250));
        this.setLayout(new GridLayout(2, 5));

        this.add(new ControlButton("1"));
        this.add(new ControlButton("2"));
        this.add(new ControlButton("3"));
        this.add(new ControlButton("4"));
        this.add(new ControlButton("5"));
        this.add(new ControlButton("6"));
        this.add(new ControlButton("7"));
        this.add(new ControlButton("8"));
        this.add(new ControlButton("9"));
        this.add(new ControlButton("X"));
    }
}
