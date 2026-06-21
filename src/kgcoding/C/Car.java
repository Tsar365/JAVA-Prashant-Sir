package kgcoding.C;

public class Car {
    private String color;
    private String model;
    private int fuel; //current clas e access krte dbe. onno kothaw dbe na
    private int cost;

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.color=color;
    }

    public Car(String color, String model, int fuel, int cost) {
        this.color=color;
        this.model=model;
        this.fuel=fuel;
        this.cost=cost;  //same class e private access kra zy
    }
}
