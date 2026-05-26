package OOP;

public class Statik {
    static int minAge=18;
    String name;
    int age;
    String date;

    public boolean allow(){ //non-static methods
        return this.age>= minAge;
        //static field k static/ non-static 2 ta tei access kra zy
    }

    public static void main(String[] args) { //this is static method.this means Static.main bcz of static keyword.

        Statik obj = new Statik();
        obj.date="abcd";
        System.out.println(minAge);
//        name="hello"; ---> not allow. Cz name is not static
        // non-static k static er vitor apply kra zy na
        minAge = 3; // allow .Cz age is static. This means statik.minAge
        System.out.println(minAge);

    }
}
