package ToyotaFactory.models;

import java.math.BigDecimal;
import java.util.List;

import ToyotaFactory.components.models.*;
import ToyotaFactory.enums.TransmissionType;

public class Dyna extends Car {
    private int cargoCapacity;

    public Dyna(String color, int maxSpeed, TransmissionType transmissionType,
                List<Wheel> wheels, FuelTank fuelTank, Engine engine,
                Electrics electrics, Headlights headlights, BigDecimal price,
                int cargoCapacity) {
        super(color, maxSpeed, transmissionType,
                wheels, fuelTank, engine, electrics, headlights, price);
        this.cargoCapacity = cargoCapacity;
    }

    public void chargePhone() {
        System.out.println("Телефон заряжается.");
    }
}