package ToyotaFactory.Factory;

import ToyotaFactory.components.models.*;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private String country;
    private Map<String, Integer> wheelDiameters;

    public Factory(String country) {
        this.country = country;
        this.wheelDiameters = new HashMap<>();
        this.wheelDiameters.put("camry", 17);
        this.wheelDiameters.put("solara", 16);
        this.wheelDiameters.put("hiance", 20);
        this.wheelDiameters.put("dyna", 20);
    }

    public String getCountry() {
        return country;
    }

    public Wheel createWheel(String model) {
        int diameter = wheelDiameters.get(model);
        return new Wheel(diameter);
    }

    public FuelTank createFuelTank() {
        return new FuelTank();
    }

    public Engine createEngine() {
        return new Engine();
    }

    public Electrics createElectric() {
        return new Electrics();
    }

    public Headlights createHeadlights() {
        return new Headlights();
    }
}