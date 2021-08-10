package Desukku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controls extends JPanel implements ActionListener {
    ControlButton[] buttons = new ControlButton[10];
    private ButtonGroup controlButtonGroup = new ButtonGroup();

    Controls() {
        this.setBackground(GameWindow.bgColor);
        this.setPreferredSize(new Dimension(0, 250));
        this.setLayout(new GridLayout(2, 5));
        this.populateControls();
    }

    private void populateControls() {
        buttons[9] = new ControlButton("X");

        // create numeric buttons
        for (int i = 0; i<9; i++)
            buttons[i] = new ControlButton(String.valueOf(i));

        // add buttons to panel
        for (ControlButton button : buttons) {
            button.addActionListener(this);
            this.add(button);
            controlButtonGroup.add(button);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (ControlButton button : buttons) {
            if (e.getSource() == button) {
                System.out.println(button.getText());
            }
        }
    }
}
