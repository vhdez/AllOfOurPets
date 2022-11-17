package edu.sla.allPets;

public class Dog extends Pet {
    // Fields
    private String fur;
    private String limbs;

    // constructors
    public Dog(String size, String color, int age, int energy, String name, Owner owner, String fur, String limbs) {
        super(size, color, age, energy, name, owner);
        this.setFur(fur);
        this.setLimbs(limbs);
    }

    // Methods
    void describeSelf() {
        System.out.println("Ruff!  I'm " + getName() + ", a " + getSize() + "-sized, " + getAge() + " year-old " + getColor() + " dog with " + getFur() + " fur.");
    }

    void bark() {
        System.out.println(getName() + " says: Woof!");
        if (getOwner() != null) {
            getOwner().setPatienceAmount(getOwner().getPatienceAmount() - 1);
        }
    }

    void sleep() {
        setEnergy(getEnergy() + 1);
        System.out.println("Rested... now " + getName() + "'s energy is at " + getEnergy());
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

    String getLimbs() {
        return limbs;
    }

    void setLimbs(String limbs) {
        this.limbs = limbs;
    }
}
