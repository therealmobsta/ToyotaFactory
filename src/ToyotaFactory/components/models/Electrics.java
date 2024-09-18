package ToyotaFactory.components.models;

/**
 * Электроника
 */
public class Electric {
    private boolean isWorking;

    public Electric() {
        this.isWorking = true;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}
