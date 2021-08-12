package Desukku;

public class Sudoku {
    /*
    public static String[][] getBands(Cell[] cells) {
        String[][] bands = new String[9][9];

        int count = 0;
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if (count == 81) break;
                bands[i][j] = cells[count].getText();
                count++;
            }
        }

        return bands;
    }
    */

    public static String[] getBand(int bandIndex, Cell[] cells) {
        String[] band = new String[9];
        int count = 0;

        for (int i=(bandIndex*9); i<((bandIndex*9)+9); i++) {
            band[count] = cells[i].getText();
            count++;
        }

        return band;
    }

    public static String[] getStack(int stackIndex, Cell[] cells) {
        String[] stack = new String[9];
        int count = 0;

        for (int i=stackIndex; i<81; i+=9) {
            stack[count] = cells[i].getText();
            count++;
        }

        return stack;
    }
}
