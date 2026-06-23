package kgcoding.D;

public class Rickshaw extends Vehecle{
 Rickshaw(){
     tier=3; //vehecle e private krle eta red line dkhabe
     //age=8;  ----> not allow bcz of private in vehecle
     setAge(6);
 }


 public void balance(){
     System.out.println("I am balanced");
 }
}
