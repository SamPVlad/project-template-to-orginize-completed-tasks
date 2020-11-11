package polymorphism;


public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Class Fish extends Animal move" + this.getName());
    }

    @Override
    public void makeSound() {
        System.out.println("Class Fish extends Animal makeSound(");
    }

    @Override
    public void eat() {
        System.out.println("Class Fish extends Animal eat");
    }
}
