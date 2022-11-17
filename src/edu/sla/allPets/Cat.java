package edu.sla.allPets;

public class Cat extends Pet {
    // Fields
    private String fur;
    private boolean hasClaws;

    // Constructors
    public Cat(String size, String color, int age, int energy, String name, Owner owner, String fur, boolean hasClaws) {
        super(size, color, age, energy, name, owner);
        this.setFur(fur);
        this.setHasClaws(hasClaws);
    }

    // Methods
    void describeSelf() {
        super.describeSelf();
        if (isHasClaws()) {
            System.out.println("Meow!  I'm a cat with " + getFur() + " fur and claws.");
        } else {
            System.out.println("Meow!  I'm a cat with " + getFur() + " fur and NO claws.");
        }
    }

    void clean() {
        System.out.println(getName() + " cleaned itself.");
    }

    void rollUpAndSleep() {
        setEnergy(getEnergy() + 1);
        System.out.println(getName() + " rolled-up and slept.");
    }
    void kneadOn(String what) {
        if (getOwner() != null) {
            System.out.println(getName() + " kneaded on " + getOwner().getName() + "'s " + what);
        } else {
            System.out.println(getName() + " kneaded on someone's " + what);
        }
    }
    void walk() {
        System.out.println("No way! " + getName() + " won't be walked.");
    }

    void purr() {
        System.out.println(getName() + " purrs hello.");
    }

    String getFur() {
        return fur;
    }

    void setFur(String fur) {
        this.fur = fur;
    }

    boolean isHasClaws() {
        return hasClaws;
    }

    void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }
}
