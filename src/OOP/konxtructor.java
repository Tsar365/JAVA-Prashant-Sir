package OOP;

public class konxtructor {


        String color;
        float price;

        konxtructor() { // Default constructor
            color = "Black";
            price = 50000;
        }

        public static void main(String[] args) {
            konxtructor swift = new konxtructor();
            System.out.println(swift.color);
            System.out.println(swift.price);
        }
    }

