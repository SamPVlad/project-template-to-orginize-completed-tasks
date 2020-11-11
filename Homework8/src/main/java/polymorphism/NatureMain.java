package polymorphism;

/*
 * Task:
 * Override methods in each class to represent the behavior of a specific animal.
 * Feel free to extend the functionality of the provided classes.
 * Look at the code of this class and try to understand the mechanism of dynamic bindings (polymorphism).
 * 
 * Задача:
 * Переопределить методы в каждом классе для представления поведения конкретного животного.
 * Не стесняйтесь расширять функциональность предоставленных классов.
 * Посмотрите код этого класса и попытайтесь понять механизм динамического связывания (полиморфизм).
 */
public class NatureMain {
    public static void main(String[] args) {
        for (Animal animal: getArrayOfAnimals()) {
            System.out.println(animal.toString());
            System.out.println(animal.getName());
            animal.move();
            animal.eat();
            animal.makeSound();
            System.out.println("---------------------");
            
        }

        Animal animal1 = new Bird("1111");
        animal1.move();
    }
    
    public static Animal[] getArrayOfAnimals() {
        Animal[] animals = {
            new Bird("parrot"),
            new Fish("walleye"),
            new Fish("perch"),
            new Primate("monkey"),
            new Predatory("lion"),
            new Primate("gorillas"),
            new Predatory("leopard")
        };
        
        return animals;
    }
}
