package OOP;

public class tostring {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public tostring(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }


    @Override
    public String toString() {

        return "yhe ame os "+ company;
    }

    public static void main(String[] args) {
        tostring obj = new tostring(4, 4, 120,
                "Swift", "SW876", "Maruti");
        System.out.println(obj); //obj call krle automatic toString call hye zabe

    }
}
