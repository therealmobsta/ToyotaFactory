package ToyotaFactory.components.models;
/**
 * Колесо
 */
public class Wheel {
    private boolean inflated;
    private int diameter;

    public Wheel(int diameter) {
        this.inflated = true;
        this.diameter = diameter;
    }

    public boolean isInflated() {
        return inflated;
    }

    public void setInflated(boolean inflated) {
        this.inflated = inflated;
    }

    public int getDiameter() {
        return diameter;
    }
}