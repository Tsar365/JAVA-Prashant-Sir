package kgcoding.E;

public  class Test {

    static void main(String[] args) {
//        Gari obj =new Gari(2); ---> not allow bcz of abstract
        Car car =new Car();
        car.commute();
        car.sound();
    }
}
