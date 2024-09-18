package ToyotaFactory.assembly;

import ToyotaFactory.Factory.PartsFactory;
import ToyotaFactory.components.models.*;
import ToyotaFactory.enums.TransmissionType;
import ToyotaFactory.exceptions.CountyFactoryNotEqualException;
import ToyotaFactory.models.Camry;
import ToyotaFactory.models.Dyna;
import ToyotaFactory.models.Hiace;
import ToyotaFactory.models.Solara;

import java.math.BigDecimal;
import java.util.Arrays;

public class AssemblyLine {
    private String country;
    private PartsFactory partsFactory;

    public AssemblyLine(String country, PartsFactory partsFactory) throws CountyFactoryNotEqualException {
        if (!country.equals(partsFactory.getCountry())) {
            throw new CountyFactoryNotEqualException("Страна фабрики и конвейера не совпадают: " + country + " и " + partsFactory.getCountry());
        }
        this.country = country;
        this.partsFactory = partsFactory;
    }

    public Camry createCamry(String color, BigDecimal price) {
        Wheel[] wheels = {
                partsFactory.createWheel(17),
                partsFactory.createWheel(17),
                partsFactory.createWheel(17),
                partsFactory.createWheel(17)
        };
        FuelTank fuelTank = partsFactory.createFuelTank();
        Engine engine = partsFactory.createEngine();
        Electrics electrics = partsFactory.createElectrics();
        Headlights headlights = partsFactory.createHeadlights();

        return new Camry(color, 200, TransmissionType.AUTOMATIC, Arrays.asList(wheels), fuelTank, engine, electrics, headlights, price);
    }

    public Solara createSolara(String color, BigDecimal price) {
        Wheel[] wheels = {
                partsFactory.createWheel(16),
                partsFactory.createWheel(16),
                partsFactory.createWheel(16),
                partsFactory.createWheel(16)
        };
        FuelTank fuelTank = partsFactory.createFuelTank();
        Engine engine = partsFactory.createEngine();
        Electrics electrics = partsFactory.createElectrics();
        Headlights headlights = partsFactory.createHeadlights();

        return new Solara(color, 180, TransmissionType.MANUAL, Arrays.asList(wheels), fuelTank, engine, electrics, headlights, price);
    }

    public Hiace createHiace(String color, BigDecimal price, int cargoCapacity) {
        Wheel[] wheels = {
                partsFactory.createWheel(20),
                partsFactory.createWheel(20),
                partsFactory.createWheel(20),
                partsFactory.createWheel(20)
        };
        FuelTank fuelTank = partsFactory.createFuelTank();
        Engine engine = partsFactory.createEngine();
        Electrics electrics = partsFactory.createElectrics();
        Headlights headlights = partsFactory.createHeadlights();

        return new Hiace(color, 150, TransmissionType.AUTOMATIC, Arrays.asList(wheels), fuelTank, engine, electrics, headlights, price,
                cargoCapacity);
    }

    public Dyna createDyna(String color, BigDecimal price, int cargoCapacity) {
        Wheel[] wheels = {
                partsFactory.createWheel(20),
                partsFactory.createWheel(20),
                partsFactory.createWheel(20),
                partsFactory.createWheel(20)
        };
        FuelTank fuelTank = partsFactory.createFuelTank();
        Engine engine = partsFactory.createEngine();
        Electrics electrics = partsFactory.createElectrics();
        Headlights headlights = partsFactory.createHeadlights();

        return new Dyna(color, 160, TransmissionType.MANUAL, Arrays.asList(wheels), fuelTank, engine, electrics, headlights, price, cargoCapacity);
    }
}