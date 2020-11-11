package interfaces;

public class Boat implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Plane implements Vehicle Plane startEngine");
    }

    @Override
    public void brake() {
        System.out.println("Plane implements Vehicle Plane brake");
    }

    @Override
    public void beep() {
        System.out.println("Plane implements Vehicle Plane beep");
    }
}
