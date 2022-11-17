package edu.sla.allPets;

public class Snake extends Pet {

    public Snake(String size, String color, int age, int energy, String name, Owner owner) {
        super(size, color, age, energy, name, owner);
    }

    void describeSelf() {
        System.out.println("Sssssss I'm " + name + ", a " + size + "-sized, " + age + " year-old " + color + " snake.");
    }

    void rollUpAndSleep() {
        energy = energy + 1;
        System.out.println(name + " rolled-up and slept.");
    }

    void eat() {
        energy = energy + 1;
        System.out.println("Yum, now " + name + "'s energy is at  " + energy);
    }

    void play() {
        energy = energy - 1;
        System.out.println(name + " is going to go hide. go find them." + name + "'s energy is now at" + energy);

    }
    void walk() {
        energy = energy - 1;
        System.out.println("Yay!, I'm going on a walk. Now " + name + "'s energy is at " + energy);
    }
}
