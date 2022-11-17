package edu.sla.allPets;

public class Fox extends Pet{
    // Fields
    private String fur;
    private boolean hasClaws;
    private String laughMessage;

    public Fox(String size, String color, int age, int energy, String name, Owner owner, String fur, boolean hasClaws, String laughMessage) {
        super(size, color, age, energy, name, owner);
        this.setFur(fur);
        this.setHasClaws(hasClaws);
        this.setLaughMessage(laughMessage);
    }

    // Methods
    void describeSelf() {
        System.out.println("ringdingdring!  I'm " + getName() + ", a " + getSize() + "-sized, " + getAge() + " year-old " + getColor() + " fox with " + getFur() + " fur.");
    }

    void clean() {
        System.out.println(getName() + " cleaned itself.");
    }

    void rollUpAndSleep() {
        setEnergy(getEnergy() + 1);
        System.out.println(getName() + " rolled-up and slept.");
    }

    void biteOn(String what) {
        if (getOwner() != null) {
            System.out.println(getName() + " bite on " + getOwner().getName() + "'s " + what);
        } else {
            System.out.println(getName() + " bite's on someone's " + what);
        }
    }

    void laughs() {
        System.out.println(getName() + " laughs " + getLaughMessage());
    }

    void eat() {
        setEnergy(getEnergy() + 1);
        System.out.println("Yum, now " + getName() + "'s energy is at " + getEnergy());
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

    String getLaughMessage() {
        return laughMessage;
    }

    void setLaughMessage(String laughMessage) {
        this.laughMessage = laughMessage;
    }
}
