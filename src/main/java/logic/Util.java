package logic;

import logic.comparators.*;

import java.util.ArrayList;

public class Util implements Sortable {
    @Override
    public void sortShipInfo(ArrayList<Ship> list, String param, String mode) {
        switch (param) {
            case "POWER": {
                if (mode.equals("ASC")) {
                    list.sort(new PowerComparatorA());
                    System.out.println(list);
                }
                if (mode.equals("DESC")) {
                    list.sort(new PowerComparatorD());
                    System.out.println(list);
                }
                return;
            }
            case "YEAR": {
                if (mode.equals("ASC")) {
                    list.sort(new YearComparatorA());
                    System.out.println(list);
                }
                if (mode.equals("DESC")) {
                    list.sort(new YearComparatorD());
                    System.out.println(list);
                }
                return;
            }
            case "SPEED": {
                if (mode.equals("ASC")) {
                    list.sort(new SpeedComparatorA());
                    System.out.println(list);
                }
                if (mode.equals("DESC")) {
                    list.sort(new SpeedComparatorD());
                    System.out.println(list);
                }
                return;
            }
            case "NAME": {
                if (mode.equals("ASC")) {
                    list.sort(new NameComparatorA());
                    System.out.println(list);
                }
                if (mode.equals("DESC")) {
                    list.sort(new NameComparatorD());
                    System.out.println(list);
                }
                return;
            }
            case "DISPLACEMENT": {
                if (mode.equals("ASC")) {
                    list.sort(new DisplacementComparatorA());
                    System.out.println(list);
                }
                if (mode.equals("DESC")) {
                    list.sort(new DisplacementComparatorD());
                    System.out.println(list);
                }
                return;
            }

        }

    }
}
