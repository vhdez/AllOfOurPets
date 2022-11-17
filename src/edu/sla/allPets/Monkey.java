package edu.sla.allPets;

public class Monkey extends Pet {
    // Fields
    private String fur;
    private int benchWeight;
    private int bodyFat;
    private String tail;

    public Monkey(String size, String color, int age, int energy, String name, Owner owner, String fur, int benchWeight, int bodyFat, String tail) {
        super(size, color, age, energy, name, owner);
        this.setFur(fur);
        this.setBenchWeight(benchWeight);
        this.setBodyFat(bodyFat);
        this.setTail(tail);
    }


    // Methods
    void describeSelf() {
        System.out.println("WOO WOO!  I'm " + getName() + ", a " + getSize() + "-sized, " + getAge() + " year-old " + getColor() + " monkey with " + getFur() + " fur and my tail is " + getTail() + " . I can bench " + getBenchWeight() + "kg and my body fat percentage is " + getBodyFat() + ".");
    }

    void WOOP() {
        System.out.println(getName() + " says: WOO!");
        if (getOwner() != null) {
            getOwner().setPatienceAmount(getOwner().getPatienceAmount() - 1);
        }
    }
    void eat() {
        if (getOwner() != null && getOwner().getFoodAmount() > 0) {
            setEnergy(getEnergy() + 1);
            System.out.println("Yum, now " + getName() + "'s energy is at " + getEnergy());
        } else {
            System.out.println("WOO WOO I don't have an owner to feed me!");
        }
    }

    void sleep() {
        setEnergy(getEnergy() + 1);
        System.out.println("Yum, now " + getName() + "'s energy is at " + getEnergy());
    }

    void play() {
        setEnergy(getEnergy() - 1);
        System.out.println("Fun!, now " + getName() + "'s energy is at " + getEnergy());
    }

    String getFur() {
        return fur;
    }

    void setFur(String fur) {
        this.fur = fur;
    }

    int getBenchWeight() {
        return benchWeight;
    }

    void setBenchWeight(int benchWeight) {
        this.benchWeight = benchWeight;
    }

    int getBodyFat() {
        return bodyFat;
    }

    void setBodyFat(int bodyFat) {
        this.bodyFat = bodyFat;
    }

    String getTail() {
        return tail;
    }

    void setTail(String tail) {
        this.tail = tail;
    }
}
