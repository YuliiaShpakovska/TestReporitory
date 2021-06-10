package logic.comparators;

import logic.Ship;

import java.util.Comparator;

public class PowerComparatorA implements Comparator<Ship> {
    @Override
    public int compare(Ship ship1, Ship ship2) {
        if (ship1.getPower() > ship2.getPower()) {
            return -1;
        } else if (ship1.getPower() < ship2.getPower()) {
            return 1;
        } else {
            return 0;
        }
    }
}
