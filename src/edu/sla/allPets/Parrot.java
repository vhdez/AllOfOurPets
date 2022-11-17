package edu.sla.allPets;

public class Parrot extends Pet{
    //fields
    String Mimic;
    boolean Fly;

    public Parrot() {
    }
    public Parrot(String size, String color, int age, int energy, String name, Owner owner, String Mimic, boolean Fly) {
        super(size, color, age, energy, name, owner);
        this.Mimic = Mimic;
        this.Fly = Fly;
    }

    void describeSelf() {
        System.out.println("Squawk!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " parrot");
    }

    void eat() {
        energy = energy + 1;
        System.out.println("Yum, now " + name + "'s energy is at " + energy);
    }

    void talk(){
        System.out.println( name  + " wants a cracker ");
    }
    void Mimic (){System.out.println( "(Gia says I love you) and " + name + " says I love you "); }
}


