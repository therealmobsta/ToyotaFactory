package ToyotaFactory.components.models;

/**
 * Электроника
 */
public class Electrics {
    private boolean working;

    public Electrics() {
        this.working = true;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}