package kgcoding.D;

public class Test {
    static void main() {
        Vehecle obj = new Vehecle();
        obj.commute();

         Rickshaw p= new Rickshaw();
        p.commute();
        p.balance();

        Cycle m=new Cycle();
        m.commute();
        m.balance();
        m.start();

    }
}
