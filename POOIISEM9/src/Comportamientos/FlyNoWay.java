package Comportamientos;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("No vuelo!!");
    }
}
