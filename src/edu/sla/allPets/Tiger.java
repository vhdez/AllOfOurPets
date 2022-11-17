package edu.sla.allPets;

public class Tiger extends Pet {
    // Fields
    private String fur;
    private boolean hasClaws;

    // Constructors
    public Tiger(String size, String color, int age, int energy, String name, Owner owner, String fur, boolean hasClaws) {
        super(size, color, age, energy, name, owner);
        this.setFur(fur);
        this.setHasClaws(hasClaws);
    }

    // Methods
    void describeSelf() {
        System.out.println("Roar!  I'm " + getName() + ", a " + getSize() + "-sized, " + getAge() + " year-old " + getColor() + " tiger with " + getFur() + " fur.");
    }

    void sleep() {
        setEnergy(getEnergy() + 2);
        System.out.println(getName() + " slept.");
    }

    void play() {
        setEnergy(getEnergy() - 1);
        System.out.println(getName() + " played around.");
    }

    void attack(String what) {
        setEnergy(getEnergy() - 1);
        System.out.println(getName() + " attacked.");

        }

    void acknowledging() {
        System.out.println(getName() + " roars.");
    }

    void walk() {
        System.out.println(getName() + " walked around.");
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

