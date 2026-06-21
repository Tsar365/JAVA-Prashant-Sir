package kgcoding.B;

import kgcoding.C.Car;  //import na krle getColor() asbe na


public class GetterTest {
    static void main() {
        Car obj =new Car("blue","xyz",20,120);
        obj.setColor("white"); //white xyz
        System.out.printf("%s %s",obj.getColor(),obj.getModel()); //blue xyz
    }
}
