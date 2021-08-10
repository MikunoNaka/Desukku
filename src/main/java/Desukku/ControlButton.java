package Desukku;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ControlButton extends JToggleButton {
    private final Color bgColor = new Color(0x282A36);
    private final Color fgColor = new Color(0xFFFFFF);
    private final Color bgColorSelected = new Color(0x6E5991);
    private final Color borderColor = new Color(0x000000);

    ControlButton(String val) {
        this.setText(val);
        this.setBackground(bgColor);
        this.setBorder(new LineBorder(borderColor));
        this.setForeground(fgColor);
        this.setFocusable(false);
        this.setFont(new Font("Helvetica", Font.PLAIN, 40));
        super.setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed() || this.isSelected()) {
            g.setColor(bgColorSelected);
        } else if (getModel().isRollover()) {
            g.setColor(bgColor);
        } else {
            g.setColor(bgColor);
        }
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }
}
