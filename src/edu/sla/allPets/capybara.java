package edu.sla.allPets;

public class capybara extends Pet{
    private String fur;
    private boolean hasClaws;

    public capybara(String size, String color, int age, int energy, String name, Owner owner, String fur, boolean hasClaws) {
        super(size, color, age, energy, name, owner);
        this.setFur(fur);
        this.setHasClaws(hasClaws);
    }

    void describeSelf() {
        System.out.println("Squeak!  I'm " + getName() + ", a " + getSize() + "-sized, " + getAge() + " year-old " + getColor() + " edu.sla.allPets.capybara with " + getFur() + " fur.");
    }

    void swim() {
        System.out.println(getName() + " went for a swim.");
    }

    void sleep() {
        setEnergy(getEnergy() + 1);
        System.out.println(getName() + " went to sleep");
    }

    void eat() {
        setEnergy(getEnergy() + 1);
        System.out.println("Yumm, now " + getName() + "'s energy is at " + getEnergy());
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
