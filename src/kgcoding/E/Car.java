package kgcoding.E;

public class Car extends Gari{

    private int doors;
    public Car(){

        super(4);
    }

    @Override
    public void sound() {
        System.out.println("vrooommm....");
    }
}
