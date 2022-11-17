package edu.sla.allPets;

public class Parrot extends Pet{
    //fields
    private String Mimic;
    private boolean Fly;

    public Parrot(String size, String color, int age, int energy, String name, Owner owner, String Mimic, boolean Fly) {
        super(size, color, age, energy, name, owner);
        this.setMimic(Mimic);
        this.setFly(Fly);
    }

    void describeSelf() {
        System.out.println("Squawk!  I'm " + getName() + ", a " + getSize() + "-sized, " + getAge() + " year-old " + getColor() + " parrot");
    }

    void eat() {
        setEnergy(getEnergy() + 1);
        System.out.println("Yum, now " + getName() + "'s energy is at " + getEnergy());
    }

    void talk(){
        System.out.println( getName() + " wants a cracker ");
    }
    void Mimic (){System.out.println( "(Gia says I love you) and " + getName() + " says I love you "); }

    String getMimic() {
        return Mimic;
    }

    void setMimic(String mimic) {
        Mimic = mimic;
    }

    boolean isFly() {
        return Fly;
    }

    void setFly(boolean fly) {
        Fly = fly;
    }
}


