package logic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(new Ship("Titanic", 269.1, 55 * 1000, 1912, 52310, 23));
        ships.add(new Ship("Atlantica", 128, 18 * 1000, 1870, 20000, 15.5));
        ships.add(new Ship("Britannica", 269, 50 * 1000, 1914, 53000, 25));

        Util util = new Util();

        System.out.println("NAME_ASC");
        util.sortShipInfo(ships, SortingMode.NAME_ASC.getParam(), SortingMode.NAME_ASC.getMode());

        System.out.println("NAME_DESC");
        util.sortShipInfo(ships, SortingMode.NAME_DESC.getParam(), SortingMode.NAME_DESC.getMode());

        System.out.println("SPEED_ASC");
        util.sortShipInfo(ships, SortingMode.SPEED_ASC.getParam(), SortingMode.SPEED_ASC.getMode());

        System.out.println("SPEED_DESC");
        util.sortShipInfo(ships, SortingMode.SPEED_DESC.getParam(), SortingMode.SPEED_DESC.getMode());

        System.out.println("POWER_ASC");
        util.sortShipInfo(ships, SortingMode.POWER_ASC.getParam(), SortingMode.POWER_ASC.getMode());

        System.out.println("POWER_DESC");
        util.sortShipInfo(ships, SortingMode.POWER_DESC.getParam(), SortingMode.POWER_DESC.getMode());

        System.out.println("YEAR_ASC");
        util.sortShipInfo(ships, SortingMode.YEAR_ASC.getParam(), SortingMode.YEAR_ASC.getMode());

        System.out.println("YEAR_DESC");
        util.sortShipInfo(ships, SortingMode.YEAR_DESC.getParam(), SortingMode.YEAR_DESC.getMode());

        System.out.println("DISPLACEMENT_ASC");
        util.sortShipInfo(ships, SortingMode.DISPLACEMENT_ASC.getParam(), SortingMode.DISPLACEMENT_ASC.getMode());

        System.out.println("DISPLACEMENT_DESC");
        util.sortShipInfo(ships, SortingMode.DISPLACEMENT_DESC.getParam(), SortingMode.DISPLACEMENT_DESC.getMode());
    }
}
