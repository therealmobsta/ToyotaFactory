package ToyotaFactory.models;
import ToyotaFactory.components.models.*;
import ToyotaFactory.enums.TransmissionType;

import java.math.BigDecimal;
import java.util.List;

public class Solara extends Car {
    private boolean roofOpen;

    public Solara(String color, int maxSpeed, TransmissionType transmissionType, List<Wheel> wheels, FuelTank fuelTank, Engine engine, Electrics electrics, Headlights headlights, BigDecimal price) {
        super(color, maxSpeed, transmissionType, wheels, fuelTank, engine, electrics, headlights, price);
        this.roofOpen = false;
    }

    public void toggleRoof() {
        roofOpen = !roofOpen;
        System.out.println("Крыша " + (roofOpen ? "открыта" : "закрыта"));
    }

    public void coolDrink() {
        System.out.println("Напиток охлаждается в мини-холодильнике.");
    }
}