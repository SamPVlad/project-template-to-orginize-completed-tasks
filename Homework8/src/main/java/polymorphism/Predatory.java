package polymorphism;

public class Predatory extends Mammal {
    public Predatory(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Class Predatory extends Mammal extends Animal move" + this.getName());
    }

    @Override
    public void makeSound() {
        System.out.println("Class Predatory extends Mammal extends Animal makeSound");
    }

    @Override
    public void eat() {
        System.out.println("Class Predatory extends Mammal extends Animal eat");
    }
}
