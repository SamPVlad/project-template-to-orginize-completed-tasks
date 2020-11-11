package polymorphism;


public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Class Bird move" + super.getName());
    }

    @Override
    public void makeSound() {
        System.out.println("Class Bird makeSound");
    }

    @Override
    public void eat() {
        System.out.println("Class Bird eat");
    }
    
}
