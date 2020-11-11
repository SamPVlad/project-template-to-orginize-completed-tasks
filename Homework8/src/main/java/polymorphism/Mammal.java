package polymorphism;

public abstract class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Class Mannal extends Animal move" + this.getName());
    }

    @Override
    public void makeSound() {
        System.out.println("Class Mannal extends Animal makeSound");
    }

    @Override
    public void eat() {
        System.out.println("Class Mannal extends Animal eat");
    }
}
