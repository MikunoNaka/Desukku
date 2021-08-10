package Desukku;

import javax.swing.JFrame;
import java.awt.*;

public class GameWindow extends JFrame {
    public static Color bgColor = new Color(0x1E1F29);

    GameWindow(Grid grid, Controls controls) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout(0, 5));
        this.setTitle("Pee Pee Poo Poo");

        this.setSize(450, 710);
        this.getContentPane().setBackground(bgColor);

        this.add(grid, BorderLayout.CENTER);
        this.add(controls, BorderLayout.SOUTH);
    }
}
