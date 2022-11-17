package edu.sla.allPets;

public class Pet {
    // Fields
    String size;
    String color;
    int age;
    int energy;
    String name;
    Owner owner;

    // constructors

    public Pet() {
    }

    public Pet(String size, String color, int age, int energy, String name, Owner owner) {
        this.size = size;
        this.color = color;
        this.age = age;
        this.energy = energy;
        this.name = name;
        this.owner = owner;
    }

    void describeSelf() {
        System.out.println("Pet says:  I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " pet.");
        System.out.println("I just stole my owner " + owner.name + "'s credit card number.  Its " + owner.getCreditCardNumber());
    }

    void eat() {
        if (owner != null && owner.getFoodAmount() > 0) {
            energy = energy + 1;
            System.out.println("Yay feeding time! now " + name + "'s energy is at " + energy);
        } else {
            System.out.println("SAD FACE I don't have an owner to feed me!");
        }
    }

    void walk() {
        energy = energy - 1;
        System.out.println("Yay!, I'm going on a walk. Now " + name + "'s energy is at " + energy);
    }
}
