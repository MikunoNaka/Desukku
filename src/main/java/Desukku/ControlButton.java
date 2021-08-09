package Desukku;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ControlButton extends JButton {
    public static Color bgColor = new Color(0x282A36);
    public static Color fgColor = new Color(0xFFFFFF);
    public static Color bgColorClicked = new Color(0x6E5991);
    public static Color borderColor = new Color(0x000000);

    ControlButton(String val) {
        this.setText(val);
        this.setBackground(bgColor);
        this.setBorder(new LineBorder(borderColor));
        this.setForeground(fgColor);
        this.setFocusable(false);
        this.setFont(new Font("Source Code Pro", Font.PLAIN, 40));
        super.setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(bgColorClicked);
        } else if (getModel().isRollover()) {
            g.setColor(bgColor);
        } else {
            g.setColor(bgColor);
        }
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }
}
