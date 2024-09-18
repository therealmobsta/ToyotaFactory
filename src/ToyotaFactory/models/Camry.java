package ToyotaFactory.models;
import ToyotaFactory.components.models.*;
import ToyotaFactory.enums.TransmissionType;

import java.math.BigDecimal;
import java.util.List;

public class Camry extends Car {
    private boolean cruiseControl;

    public Camry(String color, int maxSpeed, TransmissionType transmissionType, List<Wheel> wheels, FuelTank fuelTank,
                 Engine engine, Electrics electrics, Headlights headlights, BigDecimal price) {
        super(color, maxSpeed, transmissionType, wheels, fuelTank, engine, electrics, headlights, price);
        this.cruiseControl = false;
    }

    public void toggleCruiseControl() {
        cruiseControl = !cruiseControl;
        System.out.println("Круиз-контроль " + (cruiseControl ? "включен" : "выключен"));
    }

    public void connectMusic() {
        System.out.println("Музыка подключена через USB.");
    }
}