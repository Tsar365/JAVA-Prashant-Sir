package OOP;

public class Car {

    int noOfWheels;
    String color;
    float maxSpeed;
    float  currentFuelLiters;
    int noOfSeats;

    public Car start(){
        if (currentFuelLiters == 0){
            System.out.println("car is out of fuel, can not start");
        } else if (currentFuelLiters<3) {
            System.out.println("car is in reserved mood");
        } else {
            System.out.println("car startded....brruuuummmmmmm");
        }
        return this;
    }


    public void drive(){
//        if (currentFuelLiters == 0) {
//            System.out.println("Car is out of fuel");
//        } else if (currentFuelLiters <2){
//            System.out.println("car is in reserved mood");
//            currentFuelLiters--;
//        } else{
//            System.out.println("car is driving");
//            currentFuelLiters--;
//        }
        currentFuelLiters--;
        System.out.println("car is driving..."+ currentFuelLiters);
    }


    public void addFuel(float fuel){
        currentFuelLiters= currentFuelLiters + fuel;
//        this.currentFuelLiters= currentFuelLiters + fuel; --->same as before
    }

//    public void addFuel(float currentFuelLiters){
//        this.currentFuelLiters += currentFuelLiters ;
//    }


    public float getCurrentFuelLiters(){
        return currentFuelLiters;
    }
}
