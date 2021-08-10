package Desukku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid extends JPanel implements ActionListener {
    private final Controls controls;
    Cell[] cells = new Cell[81];
    private final ButtonGroup cellGroup = new ButtonGroup();

    Grid(Controls controls) {
        this.controls = controls;
        this.setBackground(GameWindow.bgColor);
        this.setPreferredSize(new Dimension(0, 450));
        this.setLayout(new GridLayout(9, 9));
        this.populateControls();
    }

    private void populateControls() {
        // create numeric buttons
        for (int i = 0; i<81; i++)
            cells[i] = new Cell("");

        // add buttons to panel
        for (Cell cell : cells) {
            cell.addActionListener(this);
            this.add(cell);
            cellGroup.add(cell);
        }
    }

    private String[][] getBands() {
        String[][] bands = new String[9][9];

        int count = 0;
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(count == 81) break;
                bands[i][j] = cells[count].getText();
                count++;
            }
        }

        return bands;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Cell cell : cells) {
            if (e.getSource() == cell) {
                cell.setText(controls.getSelectedValue());

                // print bands
                for (String[] i : getBands()) {
                    for (String j : i)
                        System.out.print(j + " ");
                    System.out.println();
                }

            }
        }
    }
}
