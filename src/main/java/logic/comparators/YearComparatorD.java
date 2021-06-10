package logic.comparators;

import logic.Ship;

import java.util.Comparator;

public class YearComparatorD implements Comparator<Ship> {
    @Override
    public int compare(Ship ship1, Ship ship2) {
        if (ship2.getYear() > ship1.getYear()) {
            return -1;
        } else if (ship2.getYear() < ship1.getYear()) {
            return 1;
        } else {
            return 0;
        }
    }
}
