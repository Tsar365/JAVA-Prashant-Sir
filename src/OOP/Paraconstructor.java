package OOP;

public class Paraconstructor {
    String color;
    float price;
    int age;

    Paraconstructor() { // Default constructor
//        color = "Black";
//        price = 50000;
        this("Black"); //same same but different. Parent er vitor za chilo tar sob thakeb. Just colcor change hbe
    }

    Paraconstructor(String color) { // Default constructor
       this.color = color;
        price = 50000;
        age=25;
    }

    public static void main(String[] args) {

        Paraconstructor swift = new Paraconstructor();
        System.out.println(swift.color);
        System.out.println(swift.price);

        Paraconstructor thar = new Paraconstructor("Red");
        System.out.println(thar.color);

    }
}

//student() {
//    this(5); //emn contstructor call kro zeta int recieve kre
//}
//
//student() {
//    this(id, "hi");//emn contstructor call kro zeta int and string recieve kre
//}
//
//student(int id, String sg) { //wrong .Bcz of loop
//    this(id, "hi");
//}
