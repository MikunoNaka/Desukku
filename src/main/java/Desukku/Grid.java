package Desukku;

import static Desukku.Sudoku.*;
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
        this.populateGrid();
    }

    private void populateGrid() {
        // create 81 cells and fill values
        int stackCount = 0;
        int bandCount = 0;

        for (int i = 0; i<81; i++) {
            int region = switch(stackCount) {
                case 0, 1, 2 -> switch(bandCount) {
                    case 0, 1, 2 -> 0;
                    case 3, 4, 5 -> 3;
                    case 6, 7, 8 -> 6;
                    default -> 9;
                };
                case 3, 4, 5 -> switch(bandCount) {
                    case 0, 1, 2 -> 1;
                    case 3, 4, 5 -> 4;
                    case 6, 7, 8 -> 7;
                    default -> 9;
                };
                case 6, 7, 8 -> switch(bandCount) {
                    case 0, 1, 2 -> 2;
                    case 3, 4, 5 -> 5;
                    case 6, 7, 8 -> 8;
                    default -> 9;
                };
                default -> 9;
            };

            cells[i] = new Cell(String.valueOf(i) /* "" */, stackCount, bandCount, region);

            // set stack and/or band id for next cell
            stackCount ++;
            if (stackCount == 9) {
                stackCount = 0;
                bandCount++;
                if (bandCount == 9)
                    bandCount = 0;
            }
        }

        // add buttons to panel
        for (Cell cell : cells) {
            cell.addActionListener(this);
            this.add(cell);
            cellGroup.add(cell);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Cell cell : cells) {
            if (e.getSource() == cell) {
                cell.setText(controls.getSelectedValue());

                cell.highlight(true);

                for (String i : getBand(8, cells)) {
                    System.out.println(i);
                }

                for (String i : getStack(8, cells)) {
                    System.out.println(i);
                }

                break;
            }
        }
    }
}
