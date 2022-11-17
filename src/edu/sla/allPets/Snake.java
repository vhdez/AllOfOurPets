package edu.sla.allPets;

public class Snake extends Pet {
    public Snake(String size, String color, int age, int energy, String name, Owner owner) {
        super(size, color, age, energy, name, owner);
    }

    void describeSelf() {
        System.out.println("Sssssss I'm " + getName() + ", a " + getSize() + "-sized, " + getAge() + " year-old " + getColor() + " snake.");
    }

    void rollUpAndSleep() {
        setEnergy(getEnergy() + 1);
        System.out.println(getName() + " rolled-up and slept.");
    }

    void eat() {
        setEnergy(getEnergy() + 1);
        System.out.println("Yum, now " + getName() + "'s energy is at  " + getEnergy());
    }

    void play() {
        setEnergy(getEnergy() - 1);
        System.out.println(getName() + " is going to go hide. go find them." + getName() + "'s energy is now at" + getEnergy());

    }
    void walk() {
        setEnergy(getEnergy() - 1);
        System.out.println("Yay!, I'm going on a walk. Now " + getName() + "'s energy is at " + getEnergy());
    }
}
