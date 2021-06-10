package logic.comparators;

import logic.Ship;

import java.util.Comparator;

public class SpeedComparatorA implements Comparator<Ship> {
    @Override
    public int compare(Ship ship1, Ship ship2) {
        if (ship1.getSpeed() > ship2.getSpeed()) {
            return -1;
        } else if (ship1.getSpeed() < ship2.getSpeed()) {
            return 1;
        } else {
            return 0;
        }
    }
}
