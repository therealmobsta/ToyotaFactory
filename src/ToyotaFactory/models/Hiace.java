package ToyotaFactory.models;
import ToyotaFactory.components.models.*;
import ToyotaFactory.enums.TransmissionType;

import java.math.BigDecimal;

public class Hiance extends Car {
    private int cargoCapacity;
    private Wheel spareWheel;

    public Hiance(String color, int maxSpeed, TransmissionType transmissionType,
                  BigDecimal price, Wheel[] wheels, FuelTank fuelTank, Engine engine,
                  Electric electric, Headlights headlights, int cargoCapacity, String country) {
        super(color, maxSpeed, transmissionType, price, wheels, fuelTank, engine, electric, headlights, country);
        this.cargoCapacity = cargoCapacity;
        this.spareWheel = new Wheel(20);
    }
}