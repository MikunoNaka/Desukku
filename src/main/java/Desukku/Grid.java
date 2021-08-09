package Desukku;

import javax.swing.JPanel;
import java.awt.*;

public class Grid extends JPanel {
    Grid() {
        this.setBackground(GameWindow.bgColor);
        this.setPreferredSize(new Dimension(0, 450));
        this.setLayout(new GridLayout(9, 9));

        this.add(new Cell("01"));
        this.add(new Cell("02"));
        this.add(new Cell("03"));
        this.add(new Cell("04"));
        this.add(new Cell("05"));
        this.add(new Cell("06"));
        this.add(new Cell("07"));
        this.add(new Cell("08"));
        this.add(new Cell("09"));

        this.add(new Cell("11"));
        this.add(new Cell("12"));
        this.add(new Cell("13"));
        this.add(new Cell("14"));
        this.add(new Cell("15"));
        this.add(new Cell("16"));
        this.add(new Cell("17"));
        this.add(new Cell("18"));
        this.add(new Cell("19"));

        this.add(new Cell("21"));
        this.add(new Cell("22"));
        this.add(new Cell("23"));
        this.add(new Cell("24"));
        this.add(new Cell("25"));
        this.add(new Cell("26"));
        this.add(new Cell("27"));
        this.add(new Cell("28"));
        this.add(new Cell("29"));

        this.add(new Cell("31"));
        this.add(new Cell("32"));
        this.add(new Cell("33"));
        this.add(new Cell("34"));
        this.add(new Cell("35"));
        this.add(new Cell("36"));
        this.add(new Cell("37"));
        this.add(new Cell("38"));
        this.add(new Cell("39"));

        this.add(new Cell("41"));
        this.add(new Cell("42"));
        this.add(new Cell("43"));
        this.add(new Cell("44"));
        this.add(new Cell("45"));
        this.add(new Cell("46"));
        this.add(new Cell("47"));
        this.add(new Cell("48"));
        this.add(new Cell("49"));

        this.add(new Cell("51"));
        this.add(new Cell("52"));
        this.add(new Cell("53"));
        this.add(new Cell("54"));
        this.add(new Cell("55"));
        this.add(new Cell("56"));
        this.add(new Cell("57"));
        this.add(new Cell("58"));
        this.add(new Cell("59"));

        this.add(new Cell("61"));
        this.add(new Cell("62"));
        this.add(new Cell("63"));
        this.add(new Cell("64"));
        this.add(new Cell("65"));
        this.add(new Cell("66"));
        this.add(new Cell("67"));
        this.add(new Cell("68"));
        this.add(new Cell("69"));

        this.add(new Cell("71"));
        this.add(new Cell("72"));
        this.add(new Cell("73"));
        this.add(new Cell("74"));
        this.add(new Cell("75"));
        this.add(new Cell("76"));
        this.add(new Cell("77"));
        this.add(new Cell("78"));
        this.add(new Cell("79"));

        this.add(new Cell("81"));
        this.add(new Cell("82"));
        this.add(new Cell("83"));
        this.add(new Cell("84"));
        this.add(new Cell("85"));
        this.add(new Cell("86"));
        this.add(new Cell("87"));
        this.add(new Cell("88"));
        this.add(new Cell("89"));
    }
}
