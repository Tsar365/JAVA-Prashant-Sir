package OOP;

public class Drive {
    static void main() {
//        Car myCar = new Car();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLiters());

        Car swift = new Car();
        swift.addFuel(3);
        swift.start().drive();
        swift.start().drive();
        swift.start().drive();
        swift.start().drive();
        swift.start().drive();



    }

}
