package logic.comparators;

import logic.Ship;

import java.util.Comparator;

public class PowerComparatorD implements Comparator<Ship> {
    @Override
    public int compare(Ship ship1, Ship ship2) {
        if (ship2.getPower() > ship1.getPower()) {
            return -1;
        } else if (ship2.getPower() < ship1.getPower()) {
            return 1;
        } else {
            return 0;
        }
    }
}
