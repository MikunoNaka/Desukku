package Desukku;

import javax.swing.JPanel;
import java.awt.*;

public class Grid extends JPanel {
    Grid() {
        this.setBackground(GameWindow.bgColor);
        this.setPreferredSize(new Dimension(0, 450));
        this.setLayout(new GridLayout(9, 9));

        for (int i = 1; i < 82; i++) {
            this.add(new Cell(String.valueOf(i)));
        }
    }
}
