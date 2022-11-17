package edu.sla.allPets;

public class Monkey extends Pet {
    // Fields
    String fur;
    int benchWeight;

    int bodyFat;

    String tail;

    public Monkey(){
    }

    public Monkey(String size, String color, int age, int energy, String name, Owner owner, String fur, int benchWeight, int bodyFat, String tail) {
        super(size, color, age, energy, name, owner);
        this.fur = fur;
        this.benchWeight = benchWeight;
        this.bodyFat = bodyFat;
        this.tail = tail;
    }


    // Methods
    void describeSelf() {
        System.out.println("WOO WOO!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " monkey with " + fur + " fur and my tail is " + tail+ " . I can bench " + benchWeight + "kg and my body fat percentage is " + bodyFat + ".");
    }

    void WOOP() {
        System.out.println(name + " says: WOO!");
        if (owner != null) {
            owner.setPatienceAmount(owner.getPatienceAmount() - 1);
        }
    }
    void eat() {
        if (owner != null && owner.getFoodAmount() > 0) {
            energy = energy + 1;
            System.out.println("Yum, now " + name + "'s energy is at " + energy);
        } else {
            System.out.println("WOO WOO I don't have an owner to feed me!");
        }
    }

    void sleep() {
        energy = energy + 1;
        System.out.println("Yum, now " + name + "'s energy is at " + energy);
    }

    void play() {
        energy = energy - 1;
        System.out.println("Fun!, now " + name + "'s energy is at " + energy);
    }
}
