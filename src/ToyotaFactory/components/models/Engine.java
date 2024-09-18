package ToyotaFactory.components.models;

/**
 * Двигатель
 */
public class Engine {
    private boolean working;

    public Engine() {
        this.working = true;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}