package kgcoding.A;

public class Car {
    public String color;
    public String model;
    private int fuel; //current clas e access krte dbe. onno kothaw dbe na
    int cost; //current package e access krte dbe. onno kothaw dbe na

    public Car(){

    }

    public Car(String color, String model, int fuel, int cost) {
        this.color=color;
        this.model=model;
        this.fuel=fuel;
        this.cost=cost;  //same class e private access kra zy
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuel=" + fuel +
                ", cost=" + cost +
                '}';
    }
}
