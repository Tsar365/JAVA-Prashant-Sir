package kgcoding.E;

public abstract class Gari { //abstract mean it can only inherit. not instantiate
    private int tier;

    public abstract void sound(); //abstract class chara abstract method possible na

    public Gari(int tier) {
        this.tier = tier;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public void commute(){
        System.out.println("going/////");
    }
}
