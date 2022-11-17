package edu.sla.allPets;

public class Dog extends Pet {
    // Fields
    String fur;
    String limbs;

    // constructors
    public Dog() {
    }

    public Dog(String size, String color, int age, int energy, String name, Owner owner, String fur, String limbs) {
        super(size, color, age, energy, name, owner);
        this.fur = fur;
        this.limbs = limbs;
    }

    // Methods
    void describeSelf() {
        System.out.println("Ruff!  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " dog with " + fur + " fur.");
    }

    void bark() {
        System.out.println(name + " says: Woof!");
        if (owner != null) {
            owner.setPatienceAmount(owner.getPatienceAmount() - 1);
        }
    }

    void sleep() {
        energy = energy + 1;
        System.out.println("Rested... now " + name + "'s energy is at " + energy);
    }

    void play() {
        energy = energy - 1;
        System.out.println("Fun!, now " + name + "'s energy is at " + energy);
    }

}
