package interfaces;

public class Plane implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Plane implements Vehicle startEngine");
    }

    @Override
    public void brake() {
        System.out.println("Plane implements Vehicle Vehicle brake");
    }

    @Override
    public void beep() {
        System.out.println("Plane implements Vehicle Vehicle beep");
    }


}
