package kgcoding.F;

public abstract class Bap implements Dada { //abstract mean it can only inherit. not instantiate
    private int tier;

    public abstract void sound(); //abstract class chara abstract method possible na

    public Bap(int tier) {
        this.tier = tier;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public void Go(){ //this can be declare in pola also
        System.out.println("Goooooooooo");
    }

    public void commute(){
        System.out.println("going/////");
    }
}
