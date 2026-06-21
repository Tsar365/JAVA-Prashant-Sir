package kgcoding.A;

public class Test {
    static void main() {
        Car obj = new Car();
        obj.color="red";
        obj.model="abcd";
        System.out.println(obj);
        //Car{color='red', model='abcd', fuel=0, cost=0}

        Car p =new Car("black","bmw",200,20);
        System.out.println(p);
        //Car{color='black', model='bmw', fuel=200, cost=20}
        Defalt def= new Defalt();

    }
}
