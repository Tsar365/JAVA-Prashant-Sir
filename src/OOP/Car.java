package OOP;

public class Car {
    int noOfWheles;
    String color;
    float maxSpeed;
    float  currentFuelLiters;
    int noOfSeats;

    public void drive(){
        System.out.println("car is driving");
        currentFuelLiters--;
    }

    public void addFuel(float fuel){
        currentFuelLiters= currentFuelLiters+ fuel;
    }

    public float getCurrentFuelLiters(){
        return currentFuelLiters;
    }
}
