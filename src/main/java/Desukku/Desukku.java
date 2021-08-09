package Desukku;

import java.awt.EventQueue;

public class Desukku {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var window = new GameWindow();
            window.setVisible(true);
        });
    }
}
