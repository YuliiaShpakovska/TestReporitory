package logic;

import java.util.Objects;

public class Ship {
    private String name;
    private double length;
    private double power;
    private int year;
    private double displacement;
    private double speed;

    public Ship(String name, double length, double power, int year, double displacement, double speed) {
        this.name = name;
        this.length = length;
        this.power = power;
        this.year = year;
        this.displacement = displacement;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getPower() {
        return power;
    }

    public int getYear() {
        return year;
    }

    public double getDisplacement() {
        return displacement;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", power=" + power +
                ", year=" + year +
                ", displacement=" + displacement +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Double.compare(ship.getLength(), getLength()) == 0 && Double.compare(ship.getPower(), getPower()) == 0 && getYear() == ship.getYear() && Double.compare(ship.getDisplacement(), getDisplacement()) == 0 && Double.compare(ship.getSpeed(), getSpeed()) == 0 && Objects.equals(getName(), ship.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLength(), getPower(), getYear(), getDisplacement(), getSpeed());
    }
}
