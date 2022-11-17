package edu.sla.allPets;

public class Frog extends Pet {
   //Fields
   private String texture;
    private String croakSound;

    //Constructors
    public Frog(String size, String color, int age, int energy, String name, String croakSound, String texture, Owner owner){
        super(size, color, age, energy, name, owner);
        this.setTexture(texture);
        this.setCroakSound(croakSound);
    }

    //Methods
    void describeSelf() {
        System.out.println("Ribbit!  I'm " + getName() + ", a " + getSize() + "-sized, " + getAge() + " year-old " + getColor() + " frog with a" + getCroakSound() + " croak.");
    }
    void eat() {
        setEnergy(getEnergy() + 1);
        System.out.println("Yum, now " + getName() + "'s energy is at " + getEnergy());
    }
    void croak() {
        System.out.println(getName() + " crooooooaks a hello.");
    }

    void leap(){System.out.println(getName() + " leaps over Fifi.");}

    String getTexture() {
        return texture;
    }

    void setTexture(String texture) {
        this.texture = texture;
    }

    String getCroakSound() {
        return croakSound;
    }

    void setCroakSound(String croakSound) {
        this.croakSound = croakSound;
    }
}
