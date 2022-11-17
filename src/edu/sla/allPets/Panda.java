package edu.sla.allPets;

public class Panda extends Pet {
        // Fields
        private String fur;
        private String pandaAbility;
        private String species;
        private String height;

    public Panda(String size, String color, int age, int energy, String name, Owner owner, String fur, String pandaAbility, String species, String height) {
        super(size, color, age, energy, name, owner);
        this.setFur(fur);
        this.setPandaAbility(pandaAbility);
        this.setSpecies(species);
        this.setHeight(height);
    }
        // Methods
        void describeSelf() {
            System.out.println("WOO WOO!  I'm " + getName() + ", a " + getSize() + " " + getHeight() + "-sized, " + getAge() + " year-old " + getColor() + " " + getSpecies() +" with " + getFur() + " fur. My favorite activity is "+ getPandaAbility() +"!");
        }

        void eat() {
            if (getOwner() != null && getOwner().getFoodAmount() > 0) {
                setEnergy(getEnergy() + 1);
                System.out.println("Yum, now " + getName() + "'s energy is at " + getEnergy());
            } else {
                System.out.println("My owner has no food!");
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

        void climb() {
            setEnergy(getEnergy() - 2);
            System.out.println("Climbing was awesome! Now " + getName() + "'s energy is at "+ getEnergy());

        }

    String getFur() {
        return fur;
    }

    void setFur(String fur) {
        this.fur = fur;
    }

    String getPandaAbility() {
        return pandaAbility;
    }

    void setPandaAbility(String pandaAbility) {
        this.pandaAbility = pandaAbility;
    }

    String getSpecies() {
        return species;
    }

    void setSpecies(String species) {
        this.species = species;
    }

    String getHeight() {
        return height;
    }

    void setHeight(String height) {
        this.height = height;
    }
}


