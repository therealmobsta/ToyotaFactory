package ToyotaFactory.models;
import ToyotaFactory.components.models.*;
import ToyotaFactory.enums.TransmissionType;
import ToyotaFactory.exceptions.StartCarException;

import java.math.BigDecimal;
import java.util.List;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private TransmissionType transmissionType;
    private boolean isMoving;
    private List<Wheel> wheels;
    private FuelTank fuelTank;
    private Engine engine;
    private Electrics electrics;
    private Headlights headlights;
    private BigDecimal price;

    public Car(String color, int maxSpeed, TransmissionType transmissionType, List<Wheel> wheels, FuelTank fuelTank, Engine engine, Electrics electrics, Headlights headlights, BigDecimal price) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.wheels = wheels;
        this.fuelTank = fuelTank;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
        this.price = price;
        this.isMoving = false;
    }

    public void start() throws StartCarException {
        if (wheels.stream().anyMatch(wheel -> !wheel.isInflated()) ||
                fuelTank.getFuelLevel() == 0 ||
                !engine.isWorking() ||
                !electrics.isWorking()) {
            throw new StartCarException("Невозможно начать движение. Проверьте колеса, бензобак, двигатель и электрику.");
        }
        isMoving = true;
    }

    public void stop() {
        isMoving = false;
    }

    public void turnOnHeadlights() {
        if (headlights.isWorking()) {
            System.out.println("Фары включены.");
        } else {
            System.out.println("Фары не работают.");
        }
    }
}