package ToyotaFactory.models;
import ToyotaFactory.components.models.*;
import ToyotaFactory.enums.TransmissionType;

import java.math.BigDecimal;
import java.util.List;


public class Hiace extends Car {
    private int cargoCapacity;

    public Hiace(String color, int maxSpeed, TransmissionType transmissionType,
                 List<Wheel> wheels, FuelTank fuelTank, Engine engine,
                 Electrics electrics, Headlights headlights, BigDecimal price,
                 int cargoCapacity) {
        super(color, maxSpeed, transmissionType,
                wheels, fuelTank, engine, electrics, headlights, price);
        this.cargoCapacity = cargoCapacity;
    }

    public void useSpareWheel() {
        System.out.println("Используется запасное колесо.");
    }
}