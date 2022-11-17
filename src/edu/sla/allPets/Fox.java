package edu.sla.allPets;

public class Fox extends Pet{
    // Fields
    String fur;
    boolean hasClaws;
    String laughMessage;

    public Fox(String size, String color, int age, int energy, String name, Owner owner, String fur, boolean hasClaws, String laughMessage) {
        super(size, color, age, energy, name, owner);
        this.fur = fur;
        this.hasClaws = hasClaws;
        this.laughMessage = laughMessage;
    }

    // Methods
    void describeSelf() {
        System.out.println("ringdingdring!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " fox with " + fur + " fur.");
    }

    void clean() {
        System.out.println(name + " cleaned itself.");
    }

    void rollUpAndSleep() {
        energy = energy + 1;
        System.out.println(name + " rolled-up and slept.");
    }

    void biteOn(String what) {
        if (owner != null) {
            System.out.println(name + " bite on " + owner.name + "'s " + what);
        } else {
            System.out.println(name + " bite's on someone's " + what);
        }
    }

    void laughs() {
        System.out.println(name + " laughs " + laughMessage);
    }

    void eat() {
        energy = energy + 1;
        System.out.println("Yum, now " + name + "'s energy is at " + energy);
    }
}
