package ToyotaFactory.components.models;

/**
 * Топливный бак
 */
public class FuelTank {
    private int fuelLevel;

    public FuelTank() {
        this.fuelLevel = 0;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}