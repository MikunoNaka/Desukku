package Desukku;

import java.awt.EventQueue;

public class Desukku {
    public static void main(String[] args) {
        Controls controls = new Controls();
        Grid grid = new Grid(controls);

        EventQueue.invokeLater(() -> {
            var window = new GameWindow(grid, controls);
            window.setVisible(true);
        });
    }
}
