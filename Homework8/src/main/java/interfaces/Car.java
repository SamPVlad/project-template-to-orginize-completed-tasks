package interfaces;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car implements Vehicle Plane startEngine");
    }

    @Override
    public void brake() {
        System.out.println("Car implements Vehicle brake");
    }

    @Override
    public void beep() {
        System.out.println("Car implements Vehicle Plane beep");
    }
    
}
