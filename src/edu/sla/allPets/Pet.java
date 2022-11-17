package edu.sla.allPets;

public class Pet {
    // Fields
    private String size;
    private String color;
    private int age;
    private int energy;
    private String name;
    private Owner owner;

    // constructors
    public Pet(String size, String color, int age, int energy, String name, Owner owner) {
        this.setSize(size);
        this.setColor(color);
        this.setAge(age);
        this.setEnergy(energy);
        this.setName(name);
        this.setOwner(owner);
    }

    void describeSelf() {
        System.out.println("Pet says:  I'm " + getName() + ", a " + getSize() + "-sized, " + getAge() + " year-old " + getColor() + " pet.");
        System.out.println("I just stole my owner " + getOwner().getName() + "'s credit card number.  Its " + getOwner().getCreditCardNumber());
    }

    void eat() {
        if (getOwner() != null && getOwner().getFoodAmount() > 0) {
            setEnergy(getEnergy() + 1);
            System.out.println("Yay feeding time! now " + getName() + "'s energy is at " + getEnergy());
        } else {
            System.out.println("SAD FACE I don't have an owner to feed me!");
        }
    }

    void walk() {
        setEnergy(getEnergy() - 1);
        System.out.println("Yay!, I'm going on a walk. Now " + getName() + "'s energy is at " + getEnergy());
    }

    String getSize() {
        return size;
    }

    void setSize(String size) {
        this.size = size;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getEnergy() {
        return energy;
    }

    void setEnergy(int energy) {
        this.energy = energy;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Owner getOwner() {
        return owner;
    }

    void setOwner(Owner owner) {
        this.owner = owner;
    }
}
