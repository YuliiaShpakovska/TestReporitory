package logic.comparators;

import logic.Ship;

import java.util.Comparator;

public class DisplacementComparatorD implements Comparator<Ship> {
    @Override
    public int compare(Ship ship1, Ship ship2) {
        if (ship2.getDisplacement() > ship1.getDisplacement()) {
            return -1;
        } else if (ship2.getDisplacement() < ship1.getDisplacement()) {
            return 1;
        } else {
            return 0;
        }
    }
}
