package interfaces;

import polymorphism.*;

/*
 * Task:
 * Implement methods of the Vehicle interface for each class.
 * You can modify the provided classes in any way.
 * Write examples using interfaces in the main method here.
 * Do not forget to assign newly created objects to the basic type reference and operate only with them.
 *
 * Задача:
 * Реализуйте методы интерфейса Vehicle для каждого класса.
 * Вы можете изменять предоставленные классы любым способом.
 * Напишите здесь примеры использования интерфейсов в main методе.
 * Не забывайте присваивать вновь создаваемые объекты cсылке базового типа и работать только с ними.
 */
public class InterfaceExamplesMain {
    public static void main(String[] args) {
        for (Vehicle vehicle: getArrayOfVehicles()) {
            vehicle.startEngine();
            vehicle.brake();
            vehicle.beep();
            System.out.println("---------------------");
        }
    }

    public static Vehicle[] getArrayOfVehicles() {
        Vehicle[] vehicle = {
            new Car(),
            new Boat(),
            new Plane()
        };
        return vehicle;
    }
}
