package Desukku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controls extends JPanel implements ActionListener {
    ControlButton[] buttons = new ControlButton[10];
    private final ButtonGroup controlButtonGroup = new ButtonGroup();

    Controls() {
        this.setBackground(GameWindow.bgColor);
        this.setPreferredSize(new Dimension(0, 250));
        this.setLayout(new GridLayout(2, 5));
        this.populateControls();
    }

    public String selectedValue = "";
    public void setSelectedValue(String val) {
        selectedValue = val;
    }
    public String getSelectedValue() {
        if (selectedValue.equals("X")) {
            return "";
        } else {
            return selectedValue;
        }
    }

    private void populateControls() {
        buttons[9] = new ControlButton("X");

        // create numeric buttons
        for (int i = 1; i<10; i++)
            buttons[i-1] = new ControlButton(String.valueOf(i));

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
                setSelectedValue(button.getText());
            }
        }
    }
}
