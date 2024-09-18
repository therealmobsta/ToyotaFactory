package ToyotaFactory.components.models;

/**
 * Фары
 */
public class Headlights {
    private boolean working;

    public Headlights() {
        this.working = true;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}