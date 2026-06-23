package kgcoding.F;

public  class Test {

    static void main(String[] args) {
//        Gari obj =new Gari(2); ---> not allow bcz of abstract
        Pola car =new Pola();
        car.commute();
        car.sound();
    }
}
