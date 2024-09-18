package ToyotaFactory;

import ToyotaFactory.Factory.PartsFactory;
import ToyotaFactory.assembly.AssemblyLine;
import ToyotaFactory.components.models.*;
import ToyotaFactory.enums.TransmissionType;
import ToyotaFactory.exceptions.CountyFactoryNotEqualException;
import ToyotaFactory.exceptions.StartCarException;
import ToyotaFactory.models.Camry;
import ToyotaFactory.models.Dyna;
import ToyotaFactory.models.Hiace;
import ToyotaFactory.models.Solara;

import java.math.BigDecimal;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        try {
            // созд. фабрики и сборочного конвейера
            PartsFactory partsFactory = new PartsFactory("Japan");
            AssemblyLine assemblyLine = new AssemblyLine("Japan", partsFactory);

            // созд. автомобилей
            Camry camry = assemblyLine.createCamry("черный", new BigDecimal("10000.00"));
            Solara solara = assemblyLine.createSolara("белый", new BigDecimal("12000.00"));
            Hiace hiace = assemblyLine.createHiace("черный", new BigDecimal("15000.00"), 1_000);
            Dyna dyna = assemblyLine.createDyna("черный", new BigDecimal("22000.00"), 1_500);

            // работоспособность методов для Camry
            try {
                System.out.println("Проверка Camry:");
                camry.start();
                camry.toggleCruiseControl();
                camry.connectMusic();
                camry.turnOnHeadlights();
                camry.stop();
            } catch (StartCarException e) {
                System.out.println(e.getMessage());
            }

            // работоспособность методов для Solara
            try {
                System.out.println("Проверка Solara:");
                solara.start();
                solara.toggleRoof();
                solara.coolDrink();
                solara.turnOnHeadlights();
                solara.stop();
            } catch (StartCarException e) {
                System.out.println(e.getMessage());
            }

            //  работоспособность методов для Hiace
            try {
                System.out.println("Проверка Hiace:");
                hiace.start();
                hiace.useSpareWheel();
                hiace.turnOnHeadlights();
                hiace.stop();
            } catch (StartCarException e) {
                System.out.println(e.getMessage());
            }

            // работоспособность методов для Dyna
            try {
                System.out.println("Проверка Dyna:");
                dyna.start();
                dyna.chargePhone();
                dyna.turnOnHeadlights();
                dyna.stop();
            } catch (StartCarException e) {
                System.out.println(e.getMessage());
            }

            //  информация о реализации
            System.out.println("Реализовано:");
            System.out.println("1. Создание фабрики производства деталей.");
            System.out.println("2. Создание сборочного конвейера.");
            System.out.println("3. Проверка работоспособности всех методов для всех моделей автомобилей.");
        } catch (CountyFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
    }
}
//3) Этап 3
//Мы с вами продвинулись в создании машин, но машины должны где то храниться!
//Для этого нам потребуется создать склад машин. Каждый склад может хранить в себе до 1000 машин разных типов.
//Поэтому необходимо:
//        1. Создать новый класс склад. Который имеет количество машин при создании - 0.
//        2. Создать в нем переменные, которые будут отвечать за хранение конкретного типа машин.
//3. Создать методы добавления машин по каждому типу в переменные из шага два. При добавлении машины, свободное место на складе должно уменьшаться.
//        4. Создать методы взятия машин со склада: общий счетчик уменьшается на 1, а в переменной ответственной за хранение машины определенной модели должна быть удалена конкретная машина. Методы возвращают экземпляр модели.
//        5. Написать методы, которые будут показывать количество машин по каждой модели.
//6. Расширить абстрактный класс Car, добавив атрибут Country (страна сборки). При сборке машины указать ее страну.
//
