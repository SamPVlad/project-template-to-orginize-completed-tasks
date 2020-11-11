package polymorphism;

public class Primate extends Mammal {
    public Primate(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Class Primate extends Mammal extends Animal move" + this.getName());
    }

    @Override
    public void makeSound() {
        System.out.println("Class Primate extends Mammal extends Animal makeSound");
    }

    @Override
    public void eat() {
        System.out.println("Class Primate extends Mammal extends Animal eat");
    }
}
