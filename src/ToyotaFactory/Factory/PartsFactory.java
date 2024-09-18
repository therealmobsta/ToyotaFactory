package ToyotaFactory.Factory;

import ToyotaFactory.components.models.*;

import java.util.HashMap;
import java.util.Map;

public class PartsFactory {
    private String country;

    public PartsFactory(String country) {
        this.country = country;
    }

    public Wheel createWheel(int diameter) {
        return new Wheel(diameter);
    }

    public FuelTank createFuelTank() {
        FuelTank fuelTank = new FuelTank();
        fuelTank.setFuelLevel(10); // устанавливаем уровень топлива
        return fuelTank;
    }

    public Engine createEngine() {
        Engine engine = new Engine();
        engine.setWorking(true);
        return engine;
    }

    public Electrics createElectrics() {
        Electrics electrics = new Electrics();
        electrics.setWorking(true);
        return electrics;
    }

    public Headlights createHeadlights() {
        Headlights headlights = new Headlights();
        headlights.setWorking(true);
        return headlights;
    }

    public String getCountry() {
        return country;
    }
}